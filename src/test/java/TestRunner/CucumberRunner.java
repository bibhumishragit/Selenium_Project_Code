package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Feature/dataTable.feature",       // Path to your .feature files
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

public class CucumberRunner extends AbstractTestNGCucumberTests {}