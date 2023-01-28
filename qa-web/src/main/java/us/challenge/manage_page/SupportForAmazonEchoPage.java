package us.challenge.manage_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.challenge.commons.CommonInteractions;

import java.util.List;

public class SupportForAmazonEchoPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'a-spacing-extra-large')]/following-sibling::div[1]//*[@class='sectiontitle']")
    List<WebElement> sectionList;

    public List<String> getSectionsList() {
        return CommonInteractions.getListStringForAllElements(sectionList);
    }
}
