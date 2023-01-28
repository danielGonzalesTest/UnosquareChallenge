package us.challenge.manage_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;

public class DetailsItemPage extends BasePage {

    @FindBy(css = "#apex_desktop_renewedTier2AccordionRow .apexPriceToPay span[aria-hidden='true']")
    WebElement price;

    @FindBy(css = "#renewedTier2AccordionRow #add-to-cart-button")
    WebElement addToCart;

    @FindBy(css = "#titleSection #productTitle")
    WebElement productTitle;

    public String getPrice() {
        return CommonInteractions.getText(price);
    }

    public void clickOnAddToCart() {
        CommonInteractions.click(addToCart);
    }

    public boolean isDisplayed() {
        return CommonInteractions.isElementDisplayed(productTitle);
    }
}
