package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "pretty"
        },
        features = "src/test/resources/features",
        glue = "step_def",
        dryRun = false,
        tags = "@test"
)
public class TestRunner {
}
