package demo.sauce.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber.report.html",
                "json:target/cucumber.report.json",
                "rerun:target/cucumber.report.txt"
        },
        features = "src/test/resources/features",
        glue = "demo/sauce/stepDefinitions",
        tags = "",
        publish = false,
        dryRun = false

)



public class TestRunners {

}
