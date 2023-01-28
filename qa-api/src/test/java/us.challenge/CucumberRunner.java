package us.challenge;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json", "junit:target/cucumber.xml",
                "html:target/cucumber-html-report", "rerun:target/rerun.txt"},
        features = {"./src/test/resources/features"},
        glue = { "us.challenge"}
        )

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
