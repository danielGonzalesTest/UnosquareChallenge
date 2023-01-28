package us.challenge.manage_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;

public class ConditionsOfUsePage extends BasePage {

    @FindBy(css = "input#helpsearch")
    WebElement toSearch;

    public void searchOnMoreSolutions(String nameToSearch) {
        CommonInteractions.setText(toSearch, nameToSearch);
        CommonInteractions.sendKeysEnter(toSearch);
    }

    public void clickOnLink(String nameLink) {
        String locator = String.format("//a[@class='a-link-normal' and contains(text(),'%s')]", nameLink);
        CommonInteractions.click(CommonInteractions.getWebElementWithXpath(locator));
    }
}
