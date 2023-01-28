package us.challenge.step_definitions.core;

import constants.GlobalConstants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.DetailsItemPage;

public class DetailsItemPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(DetailsItemPageSteps.class.getSimpleName());
    private DetailsItemPage detailsItemPage;

    public DetailsItemPageSteps(final DetailsItemPage detailsItemPage) {
        this.detailsItemPage = detailsItemPage;
    }

    @Then("The price displayed on the details page should be equal to {string}")
    public void thePriceDisplayedOnTheDetailsPageShouldBeEqualTo(String storedPriceName) {
        String expectedPrice = GlobalConstants.get(storedPriceName);
        Assert.assertEquals(this.detailsItemPage.getPrice(), expectedPrice);
    }

    @When("I click on Add to Cart")
    public void iClickOnAddToCart() {
        this.detailsItemPage.clickOnAddToCart();
    }

    @Then("The Details page is displayed")
    public void theDetailsPageIsDisplayed() {
        Assert.assertTrue(detailsItemPage.isDisplayed());
    }
}
