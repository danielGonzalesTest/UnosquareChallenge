package us.challenge.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.challenge.services.UsersService;

public class ApiSteps {
    private static final Logger LOGGER = LogManager.getLogger(ApiSteps.class.getSimpleName());

    private UsersService usersService;

    public ApiSteps(final UsersService usersService) {
        this.usersService = usersService;
    }

    @Given("I access the resource url {string}")
    public void iAccessTheResourceUrl(String url) {
        usersService.setUrl(url);
    }

    @When("I GET the results")
    public void iGETTheResults() {
        usersService.sendGetRequest();
    }
}
