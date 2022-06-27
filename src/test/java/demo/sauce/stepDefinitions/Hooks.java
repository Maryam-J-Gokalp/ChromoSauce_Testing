package demo.sauce.stepDefinitions;

import demo.sauce.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            byte[] snap = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(snap,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }
}
