package us.challenge.manage_page;

import constants.GlobalConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;
import us.challenge.objects.User;
import us.challenge.services.UsersService;
import us.challenge.utils.IStepActionWithStringParam;

import java.util.HashMap;
import java.util.Map;

public class CreateAccountPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(CreateAccountPage.class.getSimpleName());
    public static final String ENDPOINT = "/employees";

    @FindBy(id = "ap_customer_name")
    WebElement setYourName;

    @FindBy(id = "ap_email")
    WebElement setEmail;

    @FindBy(css = "[href*='ref=ap_register_notification_condition_of_use']")
    WebElement conditionsOfUseLink;

    private final Map<String, IStepActionWithStringParam> accountCreateOptions = new HashMap<>();

    private UsersService usersService;

    public CreateAccountPage() {
        this.usersService = new UsersService();
    }

    public void fillFieldWithValue(String field, String value) {
        accountCreateOptions.put("Your Name", this::setName);
        accountCreateOptions.put("Mobile number or email", this::setEmail);

        accountCreateOptions.get(field).performAction(value);
    }

    private void setName(String name){
        String apiNameValue = this.getApiName(name);
        CommonInteractions.setText(this.setYourName, apiNameValue);
    }

    private void setEmail(String email){
        String apiEmailValue = this.getApiEmail(email);
        CommonInteractions.setText(this.setEmail, apiEmailValue);
    }

    public void clickOnConditionsOfUse() {
        CommonInteractions.click(conditionsOfUseLink);
    }

    private String getApiEmail(String email) {
        String[] names = email.split("@");
        String emailFirstPart = GlobalConstants.get(names[0]).replace(" ", ".");
        String emailComplete = emailFirstPart.concat("@").concat(names[1]);
        LOGGER.info(String.format("Replaced Value: %s with %s", email, emailComplete));
        return emailComplete;
    }

    private String getApiName(String name) {
        User user = usersService.getFirstUser(ENDPOINT);
        String finalName = user.getEmployeeName();
        GlobalConstants.set(name, finalName);
        LOGGER.info(String.format("Replaced Value: %s with %s", name, finalName));
        return finalName;
    }
}
