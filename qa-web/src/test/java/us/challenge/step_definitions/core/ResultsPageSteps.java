package us.challenge.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.ResultsPage;

public class ResultsPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(ResultsPageSteps.class.getSimpleName());
    private ResultsPage resultsPage;

    public ResultsPageSteps(final ResultsPage resultsPage) {
        this.resultsPage = resultsPage;
    }

    @Then("The Result page is displayed")
    public void theResultPageIsDisplayed() {
        Assert.assertTrue(resultsPage.isDisplayed());
    }

    @And("I store the price of the first item found as {string}")
    public void iStoreThePriceOfTheFirstItemFoundAs(String nameToStore) {
        resultsPage.storeItemPrice(nameToStore);
    }

    @When("I click on the first item found")
    public void iClickOnTheFirstItemFound() {
        resultsPage.clickOnFirstElement();
    }
}
