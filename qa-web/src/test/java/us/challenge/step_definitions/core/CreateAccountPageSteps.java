package us.challenge.step_definitions.core;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.CreateAccountPage;

public class CreateAccountPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountPageSteps.class.getSimpleName());
    private CreateAccountPage createAccountPage;

    public CreateAccountPageSteps(final CreateAccountPage createAccountPage) {
        this.createAccountPage = createAccountPage;
    }

    @When("I fill out the following fields on Create Account form:")
    public void iFillOutTheFollowingFieldsOnCreateAccountForm() {
        
    }

    @And("I click on Conditions of Use")
    public void iClickOnConditionsOfUse() {

    }
}
