package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailedProductPage extends BasePage {

    private final By backToProductsLocator = By.name("[name='back-to-products']");

    public DetailedProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return backToProductsLocator;
    }

    public WebElement backToProducts() {
       return driver.findElement(backToProductsLocator);
    }
}
