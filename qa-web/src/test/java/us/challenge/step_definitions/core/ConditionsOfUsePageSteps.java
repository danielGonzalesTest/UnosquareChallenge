package us.challenge.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.ConditionsOfUsePage;

public class ConditionsOfUsePageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(ConditionsOfUsePageSteps.class.getSimpleName());
    private ConditionsOfUsePage conditionsOfUsePage;

    public ConditionsOfUsePageSteps(final ConditionsOfUsePage conditionsOfUsePage) {
        this.conditionsOfUsePage = conditionsOfUsePage;
    }

    @When("I search {string} on Find more solutions")
    public void iSearchOnFindMoreSolutions(String arg0) {
    }

    @And("I click on {string} link")
    public void iClickOnLink(String arg0) {

    }
}
