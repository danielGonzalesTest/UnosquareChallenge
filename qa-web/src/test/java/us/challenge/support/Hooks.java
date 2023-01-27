package us.challenge.support;

import us.challenge.driver_manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;

public class Hooks {

    private static final Logger LOGGER = LogManager.getLogger(Hooks.class.getSimpleName());

    @AfterSuite
    public void afterFeature() {
        LOGGER.info("End of execution");
        DriverManager.getInstance().closeDriver();
        DriverManager.getInstance().quitDriver();
    }
}
