package demo.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends LoginPage{

    @FindBy(xpath = "//span[@class='title']")
    public WebElement productsTitle;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement orderDropdown;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCartLink;


}
