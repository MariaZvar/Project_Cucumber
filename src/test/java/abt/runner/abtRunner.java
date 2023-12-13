package abt.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/abt",
        glue = "abt/step_definitions",
        dryRun = false
)
public class abtRunner {

}
