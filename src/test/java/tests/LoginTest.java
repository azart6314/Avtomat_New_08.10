package tests;

import Configuration.ReadProperties;
import Factory.BrowserFactory;
import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmailInput().sendKeys(ReadProperties.username());
        loginPage.getPassword().sendKeys(ReadProperties.password());
        loginPage.getLogInButton().click();
        Assert.assertTrue(new DashboardPage(driver).isPageOpened());

        //удалили после 1 модернизаций в  loginPage
//        driver.findElement(By.id("name")).sendKeys(ReadProperties.username());
//        driver.findElement(By.id("password")).sendKeys(ReadProperties.password());
//        driver.findElement(By.id("button_primary")).click();

        //Assert.assertTrue(new DashboardPage(driver).isPageOpened()); До изменения не сохранил

    }

    @Test
    public void loginSuccessfulTest() {
        Assert.assertTrue(
                userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password())
                        .isPageOpened());

    }
    @Test
    public void loginIncorrectTest() {
        Assert.assertEquals(
                userStep.loginIncorrect(ReadProperties.username(), "qwewqqqw")
                        .getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again."
        );
    }


}
