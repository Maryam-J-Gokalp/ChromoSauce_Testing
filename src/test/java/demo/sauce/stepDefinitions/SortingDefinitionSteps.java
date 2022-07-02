package demo.sauce.stepDefinitions;

import demo.sauce.pages.HomePage;
import demo.sauce.utilities.BrowserUtils;
import demo.sauce.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDefinitionSteps {
    HomePage homePage = new HomePage();
    Select select = new Select(homePage.orderDropdown);
    @When("User clicks the sorting dropdown")
    public void user_clicks_the_sorting_dropdown() {


        homePage.orderDropdown.click();

    }
    @When("User clicks the {string}")
    public void user_clicks_the(String string) {


        select.selectByValue("za");



    }
    @Then("User sees the all items sorted alphabetical")
    public void user_sees_the_all_items_sorted_alphabetical() {

        List<WebElement> inventoryItemNames = homePage.inventoryItemNames;

        List<String> sortedList = new ArrayList<>();

        for (int i = 0; i < inventoryItemNames.size(); i++) {
            sortedList.add(inventoryItemNames.get(i).getText());
        }

        Collections.sort(sortedList);
        Collections.reverse(sortedList);

        System.out.println(BrowserUtils.compareForEquals(inventoryItemNames, sortedList));


    }
}
