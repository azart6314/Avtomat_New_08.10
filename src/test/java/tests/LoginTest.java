package tests;

import Configuration.ReadProperties;
import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.UserStep;

public class LoginTest extends BaseTest {


    @Test
    public void test1() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        productsStep.addFirstProductToCart();
        productsStep.addSecondProductToCart();
        productsStep.backToProductsPage();


    }





}
