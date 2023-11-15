package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;

public class UserStep extends BaseStep {
    private LoginPage loginPage;

    public UserStep(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public ProductsPage login(String email, String psw){
        loginPage.successfulLogin(email, psw);
        return new ProductsPage(driver);
    }

    public ProductsPage logout() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        return new ProductsPage(driver);
    }
}
