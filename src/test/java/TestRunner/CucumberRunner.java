package TestRunner;

import io.cucumber.junit.*;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature/AmaxonLogin.feature",       // Path to your .feature files
        glue = {"Stepdefinition","Utilities"},                        // Package containing step definitions
        plugin = {
                "pretty",                                   // Console output
                "html:target/cucumber-reports/html",        // HTML report
                "json:target/cucumber-reports/report.json"  // JSON report
        },
        monochrome = true,                              // Clean console output
        dryRun = false                                 // Set true to validate steps without executing
        //tags = "@SmokeTest"                             // Run scenarios with this tag
)

public class CucumberRunner {}