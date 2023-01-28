package us.challenge.manage_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;

public class ShoppingCartPage extends BasePage {

    @FindBy(className = "sc-product-price")
    WebElement price;

    public String getPrice() {
        return CommonInteractions.getText(price);
    }
}
