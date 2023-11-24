package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailedProductPage extends BasePage {

    private final By backToProductsIconLocator = By.name("[name='back-to-products']");

    public DetailedProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return backToProductsIconLocator;
    }

    public WebElement backToProducts() {
       return driver.findElement(backToProductsIconLocator);
    }
}
