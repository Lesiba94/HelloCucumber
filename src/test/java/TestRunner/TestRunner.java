package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/main/resources/Features/LoginPage.feature",
        //path of step definition file
        glue = "StepDefinitions"
)
public class TestRunner {
}
