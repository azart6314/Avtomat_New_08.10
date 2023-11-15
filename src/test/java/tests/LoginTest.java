package tests;

import Configuration.ReadProperties;
import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.UserStep;

public class LoginTest extends BaseTest {

//    @Test
//    public void loginPage(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.getEmailInput().sendKeys(ReadProperties.username());
//        loginPage.getPasswordInput().sendKeys(ReadProperties.password());
//        loginPage.getLoginButton().click();
//    }

    @Test
    public void detailCardTest (){
        userStep.login(ReadProperties.username(), ReadProperties.password());
        productsStep.openSecondProductCard();
        productsStep.backToProductsPage();

    }


}
