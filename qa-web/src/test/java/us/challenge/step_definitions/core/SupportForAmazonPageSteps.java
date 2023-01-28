package us.challenge.step_definitions.core;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.SupportForAmazonEchoPage;

import java.util.List;

public class SupportForAmazonPageSteps extends BasePage {

    private SupportForAmazonEchoPage supportForAmazonEchoPage;

    public SupportForAmazonPageSteps(final SupportForAmazonEchoPage supportForAmazonEchoPage) {
        this.supportForAmazonEchoPage = supportForAmazonEchoPage;
    }

    @Then("The following elements should be displayed:")
    public void theFollowingElementsShouldBeDisplayed(List<String> expectedList) {
        List<String> actualElements = this.supportForAmazonEchoPage.getSectionsList();
        Assert.assertEquals(actualElements, expectedList, "Found list: " + actualElements);
    }
}
