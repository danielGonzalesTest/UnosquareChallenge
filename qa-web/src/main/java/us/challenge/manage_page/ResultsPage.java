package us.challenge.manage_page;

import constants.GlobalConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;

public class ResultsPage extends BasePage {

    @FindBy(xpath = "//span[text()='RESULTS']")
    WebElement pageTitle;

    @FindBy(css = ".widgetId\\=search-results_1 .a-price-symbol")
    WebElement priceFistItemSymbol;

    @FindBy(css = ".widgetId\\=search-results_1 .a-price-whole")
    WebElement priceFistItemAmount;

    @FindBy(css = ".widgetId\\=search-results_1 .a-price-fraction")
    WebElement priceFistItemFraction;

    public boolean isDisplayed() {
        return CommonInteractions.isElementDisplayed(pageTitle);
    }

    public void storeItemPrice(String nameToStore) {
        String symbolFistElement = CommonInteractions.getText(priceFistItemSymbol);
        String amountFistElement = CommonInteractions.getText(priceFistItemAmount);
        String fractionFistElement = CommonInteractions.getText(priceFistItemFraction);
        GlobalConstants.set(nameToStore, String.format("%s%s.%s", symbolFistElement, amountFistElement, fractionFistElement));
    }

    public void clickOnFirstElement() {
        CommonInteractions.click(priceFistItemAmount);
    }
}
