package us.challenge.manage_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;

public class ShoppingCartPreviewPage extends BasePage {

    @FindBy(css = "#NATC_SMART_WAGON_CONF_MSG_SUCCESS span")
    WebElement message;

    public String getMessage() {
        return CommonInteractions.getText(message);
    }
}
