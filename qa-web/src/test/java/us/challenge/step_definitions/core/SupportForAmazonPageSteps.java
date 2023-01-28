package us.challenge.step_definitions.core;

import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.SupportForAmazonEchoPage;

public class SupportForAmazonPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(SupportForAmazonPageSteps.class.getSimpleName());
    private SupportForAmazonEchoPage supportForAmazonEchoPage;

    public SupportForAmazonPageSteps(final SupportForAmazonEchoPage supportForAmazonEchoPage) {
        this.supportForAmazonEchoPage = supportForAmazonEchoPage;
    }

    @Then("The following elements should be displayed:")
    public void theFollowingElementsShouldBeDisplayed() {
    }
}
