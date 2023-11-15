package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    //блок описания локаторов для элементов
    private static final String pagePath = "cart.html";

    private final By firstProductNameLocator = By.xpath("//div[text()='Sauce Labs Backpack']");
    private final By secondProductNameLocator = By.xpath("//div[text()='Sauce Labs Bike Light']");
    private final By secondProductRemoveLocator = By.id("remove-sauce-labs-bike-light");
    private final By thirdProductNameLocator = By.xpath("//div[text()='Sauce Labs Backpack'] ");

    private final By continueShoppingLocator = By.id("continue-shopping");
    private final By checkoutLocator = By.id("checkout");

    //блок инициализации страницы
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return continueShoppingLocator;
    }

    //блок атомарных методов
    public void openPageByUrl (){
        openPageByUrl(pagePath);
    }

    public WebElement getFirstProductName() {
        return driver.findElement(firstProductNameLocator);
    }
    public WebElement getSecondProductName () {return driver.findElement(secondProductNameLocator);}
    public WebElement getSecondProductRemove() {return driver.findElement(secondProductRemoveLocator);}
    public WebElement getThirdProductName () {return driver.findElement(thirdProductNameLocator);}

    public WebElement continueShopping (){return driver.findElement(continueShoppingLocator);}
    public WebElement checkout(){return driver.findElement(checkoutLocator);}

}
