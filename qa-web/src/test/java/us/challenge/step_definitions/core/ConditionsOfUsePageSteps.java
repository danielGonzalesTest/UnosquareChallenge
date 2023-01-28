package us.challenge.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.ConditionsOfUsePage;

public class ConditionsOfUsePageSteps extends BasePage {

    private ConditionsOfUsePage conditionsOfUsePage;

    public ConditionsOfUsePageSteps(final ConditionsOfUsePage conditionsOfUsePage) {
        this.conditionsOfUsePage = conditionsOfUsePage;
    }

    @When("I search {string} on Find more solutions")
    public void iSearchOnFindMoreSolutions(String nameToSearch) {
        this.conditionsOfUsePage.searchOnMoreSolutions(nameToSearch);
    }

    @And("I click on {string} link")
    public void iClickOnLink(String nameLink) {
        this.conditionsOfUsePage.clickOnLink(nameLink);
    }
}
