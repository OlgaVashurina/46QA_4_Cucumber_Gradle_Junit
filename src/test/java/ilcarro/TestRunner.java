package ilcarro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/resources/features",
                glue = "ilcarro.stepsDefinitions",
                plugin = {"pretty","html:target/cucumber-reports.html"},
                tags = "@Login or @InvalidPassword"
        )

public class TestRunner {
}
