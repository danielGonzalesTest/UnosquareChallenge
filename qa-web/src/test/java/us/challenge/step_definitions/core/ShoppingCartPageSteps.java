package us.challenge.step_definitions.core;

import constants.GlobalConstants;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.ShoppingCartPage;

public class ShoppingCartPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(ShoppingCartPageSteps.class.getSimpleName());
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageSteps(final ShoppingCartPage shoppingCartPage) {
        this.shoppingCartPage = shoppingCartPage;
    }

    @Then("The price displayed on the Shopping cart page should be equal to {string}")
    public void thePriceDisplayedOnTheShoppingCartPageShouldBeEqualTo(String storedPriceName) {
        String expectedPrice = GlobalConstants.get(storedPriceName);
        Assert.assertEquals(this.shoppingCartPage.getPrice(), expectedPrice);
    }
}
