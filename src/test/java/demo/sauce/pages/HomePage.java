package demo.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends LoginPage{

    @FindBy(xpath = "//span[@class='title']")
    public WebElement productsTitle;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement orderDropdown;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//div[@class='inventory_item']")
    public List<WebElement> inventoryItems;

    @FindBy(css = ".inventory_item_name")
    public List<WebElement> inventoryItemNames;

    @FindBy(css = ".inventory_item_desc")
    public List<WebElement> inventoryItemDescriptions;

    @FindBy(css = ".inventory_item_img")
    public List<WebElement> images;




}
