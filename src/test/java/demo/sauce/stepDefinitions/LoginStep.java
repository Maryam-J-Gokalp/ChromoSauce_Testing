package demo.sauce.stepDefinitions;

import demo.sauce.pages.HomePage;
import demo.sauce.pages.LoginPage;
import demo.sauce.utilities.ConfigurationReader;
import demo.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStep {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));
    }

    @Given("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        loginPage.login(username,password);

    }
    @When("User clicks the login button")
    public void user_clicks_the_login_button() {

        loginPage.loginButton.click();

    }
    @Then("User should see the home page")
    public void user_should_see_the_home_page() {

        Assert.assertTrue(homePage.productsTitle.isDisplayed());
    }


}
