package us.challenge.manage_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;

public class NavBarPage extends BasePage {

    @FindBy(css = "input#twotabsearchtextbox")
    WebElement searchInput;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @FindBy(css = "a#nav-cart")
    WebElement cartButton;

    @FindBy(id = "nav-link-accountList")
    WebElement accountListMenu;

    public void searchItem(String nameToSearch) {
        CommonInteractions.setText(searchInput, nameToSearch);
        CommonInteractions.click(searchButton);
    }

    public void clickOnCartButton() {
        CommonInteractions.click(cartButton);
    }

    public void openAccountAndListMenu() {
        CommonInteractions.hoverOverWebElement(accountListMenu);
    }

    public void clickStartHereOnMenu(){
        CommonInteractions.click(CommonInteractions.getWebElementWithCss("#nav-flyout-ya-newCust a"));
    }
}
