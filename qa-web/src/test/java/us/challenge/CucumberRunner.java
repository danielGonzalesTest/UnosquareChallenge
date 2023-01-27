package us.challenge;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@CucumberOptions(
        plugin = { "pretty", "junit:report/cucumber.xml",
        "html:report/cucumber-html-report.html", "rerun:report/rerun.txt", "json:report/cucumber.json"},
        features = {"./src/test/resources/features"},
        glue = { "us.challenge"})

public class CucumberRunner extends AbstractTestNGCucumberTests {
    private static final Logger LOG = LogManager.getLogger(CucumberRunner.class);
}
