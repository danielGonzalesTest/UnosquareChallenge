package us.challenge.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.NavBarPage;

public class NavBarPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(NavBarPageSteps.class.getSimpleName());
    private NavBarPage navBarPage;

    public NavBarPageSteps(final NavBarPage navBarPage) {
        this.navBarPage = navBarPage;
    }

    @When("I search the {string} item on navbar")
    public void iSearchTheItemOnNavbar(String nameToSearch) {
        navBarPage.searchItem(nameToSearch);
    }

    @Given("I click on Cart on navbar")
    public void iClickOnCartOnNavbar() {
        navBarPage.clickOnCartButton();
    }

    @When("I open Account & List menu on navbar")
    public void iOpenAccountListMenuOnNavbar() {
        navBarPage.openAccountAndListMenu();
    }

    @And("I click on Start here on menu displayed")
    public void iClickOnStartHereOnMenuDisplayed() {
        navBarPage.clickStartHereOnMenu();
    }
}
