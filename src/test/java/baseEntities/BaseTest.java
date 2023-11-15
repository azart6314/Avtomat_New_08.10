package baseEntities;

import Factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.ProductsStep;
import steps.UserStep;

public class BaseTest {
    protected WebDriver driver;
    protected UserStep userStep;
    protected ProductsStep productsStep;


    @BeforeMethod
    public void setUp(){
        driver = new BrowserFactory().getDriver();
        userStep = new UserStep(driver);
        productsStep = new ProductsStep(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
