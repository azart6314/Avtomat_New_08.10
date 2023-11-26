package tests;

import Configuration.ReadProperties;
import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {


    //    @Test
    public void loginTest() {
        driver.get(ReadProperties.getUrl()); //не фак что надо

        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.getEmailInput().sendKeys(ReadProperties.username());
        LoginPage.getPassword().sendKeys(ReadProperties.password());
        LoginPage.getLogInButton().click();

        Assert.assertTrue(new DashboardPage(driver).isPageOpened());
    }

    @Test
    public void loginSuccessfulTest() {

        Assert.assertTrue(userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password()) .isPageOpened());
    }


    //        @Test
    public void loginIncorrectTest() {
        Assert.assertEquals(
                userStep.loginIncorrect(ReadProperties.username(), "qwewqqqw")
                        .getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again."
        );
    }


}
