package pages.project;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    private final By pageNameLocator = By.xpath("//span[text()='Products']");

    private final By firstProductNameLocator = By.xpath("//div[text()='Sauce Labs Backpack']");
    private final By firstProductAddCardLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By firstProductRemoveLocator = By.id("remove-sauce-labs-backpack");
    private final By firstProductPriceLocator = By.xpath("//div[text()='29.99']");


    private final By secondProductNameLocator = By.xpath("//div[text()='Sauce Labs Bike Light']");
    private final By secondProductAddCardLocator = By.id("item_0_title_link");
    private final By secondProductRemoveLocator = By.id("remove-sauce-labs-bike-light");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageNameLocator;
    }

    public WebElement getFirstProductName() {
        return driver.findElement(firstProductNameLocator);
    }

    public WebElement getFirstProductAddCard() {
        return driver.findElement(firstProductAddCardLocator);
    }

    public WebElement getFirstProduct() {
        return driver.findElement(firstProductRemoveLocator);
    }

    public WebElement getFirstProductPrice() {
        return driver.findElement(firstProductPriceLocator);
    }


}
