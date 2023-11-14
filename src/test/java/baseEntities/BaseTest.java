package baseEntities;

import Factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new BrowserFactory().getDriver();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
