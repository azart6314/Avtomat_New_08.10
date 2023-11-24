package baseEntities;

import Configuration.ReadProperties;
import Factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import steps.ProductsStep;
import steps.UserStep;

public class BaseTest {
    protected WebDriver driver;
    protected UserStep userStep;
    protected ProductsStep productsStep;
    protected LoginPage loginPage;



    @BeforeMethod
    public void setUp(){
        driver = new BrowserFactory().getDriver();
        driver.get(ReadProperties.getUrl());

        userStep = new UserStep(driver);
        productsStep = new ProductsStep(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
