package us.challenge.manage_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;
import us.challenge.utils.IStepActionWithStringParam;

import java.util.HashMap;
import java.util.Map;

public class CreateAccountPage extends BasePage {

    @FindBy(id = "ap_customer_name")
    WebElement setYourName;

    @FindBy(id = "ap_email")
    WebElement setEmail;

    @FindBy(css = "[href*='ref=ap_register_notification_condition_of_use']")
    WebElement conditionsOfUseLink;

    private final Map<String, IStepActionWithStringParam> accountCreateOptions = new HashMap<>();

    public void fillFieldWithValue(String field, String value) {
        accountCreateOptions.put("Your Name", this::setName);
        accountCreateOptions.put("Mobile number or email", this::setEmail);

        accountCreateOptions.get(field).performAction(value);
    }

    private void setName(String name){
        CommonInteractions.setText(this.setYourName, name);
    }

    private void setEmail(String email){
        CommonInteractions.setText(this.setEmail, email);
    }

    public void clickOnConditionsOfUse() {
        CommonInteractions.click(conditionsOfUseLink);
    }
}
