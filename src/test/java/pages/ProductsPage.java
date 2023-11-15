package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    private static final String pagePath = "inventory.html";

    private final By pageNameLocator = By.xpath("//span[text()='Products']");
    private final By backToProductLocator = By.id("back-to-products");

    private final By cartButtonLocator = By.cssSelector(".shopping_cart_link");
    private final By counterCartLocator = By.name("shopping_cart_badge");


    private final By firstProductNameLocator = By.xpath("//div[text()='Sauce Labs Backpack']");
    private final By firstProductAddCardLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By firstProductRemoveLocator = By.id("remove-sauce-labs-backpack");
    private final By firstProductPriceLocator = By.xpath("//div[text()='29.99']");


    private final By secondProductNameLocator = By.xpath("//div[text()='Sauce Labs Bike Light']");
    private final By secondProductAddCardLocator = By.id("item_0_title_link");
    private final By secondProductRemoveLocator = By.id("remove-sauce-labs-bike-light");
    private final By secondProductPriceLocator = By.xpath("//div[text()='9.99']");

    //3
    private final By thirdProductNameLocator = By.xpath("//div[@class='inventory_item_name ' and text()='Sauce Labs Backpack']");
    private final By thirdProductAddCardLocator = By.name("[name='add-to-cart-sauce-labs-bolt-t-shirt']");
    private final By thirdProductRemoveLocator = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By thirdProductPriceLocator = By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div/text()[2]");


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
    public WebElement getFirstProductAddCard() { return driver.findElement(firstProductAddCardLocator);}
    public WebElement getFirstProduct() { return driver.findElement(firstProductRemoveLocator);}
    public WebElement getFirstProductPrice() { return driver.findElement(firstProductPriceLocator);}

    //2
    public WebElement getSecondProductName () {return driver.findElement(secondProductNameLocator);}
    public WebElement getSecondProductAddCard() {return driver.findElement(secondProductAddCardLocator);}
    public WebElement getSecondProductRemove() {return driver.findElement(secondProductRemoveLocator);}
    public WebElement getSecondProductPrice(){return driver.findElement(secondProductPriceLocator);}

    //3
    public WebElement getThirdProductName () {return driver.findElement(thirdProductNameLocator);}
    public WebElement getThirdProductAddCard() {return driver.findElement(thirdProductAddCardLocator);}
    public WebElement getThirdProductRemove() {return driver.findElement(thirdProductRemoveLocator);}
    public WebElement getThirdProductPrice(){return driver.findElement(thirdProductPriceLocator);}

    //card
    public WebElement getCartButton () { return driver.findElement(cartButtonLocator);}
    public WebElement getCounterCart() {return driver.findElement(counterCartLocator);}

    public void openPageByUrl (){
        openPageByUrl(pagePath);
    }

    public WebElement getBackToProduct (){return driver.findElement(backToProductLocator);}
}
