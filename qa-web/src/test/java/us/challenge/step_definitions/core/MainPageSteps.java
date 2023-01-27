package us.challenge.step_definitions.core;

import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.challenge.manage_page.BasePage;
import us.challenge.manage_page.MainPage;
import us.challenge.utils.PropertyAccessor;

public class MainPageSteps extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(MainPageSteps.class.getSimpleName());
    private String sigUpUrl = PropertyAccessor.getInstance().getBaseUrl();
    private MainPage mainPage;

    public MainPageSteps(final MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @Given("I go to Amazon page")
    public void iGoToAmazonPage() {
        this.navigateTo(sigUpUrl);
    }
}
