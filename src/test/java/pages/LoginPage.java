package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // Блок описания локаторов для эментов Блок описания локаторов для эментов (обычно приветные финальные значения для by)
    private final By emailInputLocator = By.id("user-name");
    private final By passwordInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");



    // Блок иницализации страницы
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return loginButtonLocator;
    }


    // Блок атомарных методов //поиск элементов
    public WebElement getEmailInput() {
        return driver.findElement(emailInputLocator);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(passwordInputLocator);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButtonLocator);
    }

    public void successfulLogin (String email, String psw) {
        getEmailInput().sendKeys(email);
        getPasswordInput().sendKeys(psw);
        getLoginButton().click();
    }


}
