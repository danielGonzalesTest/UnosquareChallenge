package us.challenge.step_definitions.core;

import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.ShoppingCartPreviewPage;

public class ShoppingCartPreviewPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(ShoppingCartPreviewPageSteps.class.getSimpleName());
    private ShoppingCartPreviewPage shoppingCartPreviewPage;

    public ShoppingCartPreviewPageSteps(final ShoppingCartPreviewPage shoppingCartPreviewPage) {
        this.shoppingCartPreviewPage = shoppingCartPreviewPage;
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String expectedMessage) {
        Assert.assertEquals(this.shoppingCartPreviewPage.getMessage(), expectedMessage);
    }
}
