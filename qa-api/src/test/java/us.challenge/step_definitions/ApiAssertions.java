package us.challenge.step_definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import us.challenge.services.UsersService;


public class ApiAssertions {

    private UsersService usersService;

    public ApiAssertions(final UsersService usersService) {
        this.usersService = usersService;
    }

    @Then("The status code should be {int}")
    public void theStatusCodeShouldBe(int expectedCode) {
        Assert.assertEquals(usersService.getResponseCode(), expectedCode);
    }
}
