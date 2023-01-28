package us.challenge.step_definitions.core;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.CreateAccountPage;

import java.util.List;
import java.util.Map;

public class CreateAccountPageSteps extends BasePage {

    private CreateAccountPage createAccountPage;

    public CreateAccountPageSteps(final CreateAccountPage createAccountPage) {
        this.createAccountPage = createAccountPage;
    }

    @When("I fill out the following fields on Create Account form:")
    public void iFillOutTheFollowingFieldsOnCreateAccountForm(final DataTable table) {
        List<Map<String, String>> dataToFill = table.asMaps(String.class, String.class);
        for (Map<String, String> rowMap : dataToFill) {
            this.createAccountPage.fillFieldWithValue(rowMap.get("FIELD"), rowMap.get("VALUE"));
        }
    }

    @And("I click on Conditions of Use")
    public void iClickOnConditionsOfUse() {
        this.createAccountPage.clickOnConditionsOfUse();
    }
}
