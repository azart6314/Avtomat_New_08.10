package tests;

import Configuration.ReadProperties;
import baseEntities.BaseTest;
import org.testng.annotations.Test;
import pages.project.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginPage(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmailInput().sendKeys(ReadProperties.username());
        loginPage.getPasswordInput().sendKeys(ReadProperties.password());
        loginPage.getLoginButton().click();
    }

}
