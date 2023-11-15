package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInformationPage extends BasePage {
    //блок описания лакаторов
    private static final String pagePath ="checkout-step-one.html";

    private final By firstNameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");
    private final By postalCodLocator = By.id("postal-code");
    private final By cancelButtonLocator = By.id("cancel");
    private final By continueButtonLocator = By.id("continue");
    private final By cartButtonLocator = By.cssSelector(".shopping_cart_link");





    //инициализация страницы
    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }


    //блок атамарных методов
    private WebElement getFirstName (){return driver.findElement(firstNameLocator);}
    private WebElement getLastName (){return driver.findElement(lastNameLocator);}
    private WebElement getPostalCod (){return driver.findElement(postalCodLocator);}

    private WebElement getCancelButton () {return driver.findElement(cancelButtonLocator);}
    private WebElement getContinueButton (){return driver.findElement(continueButtonLocator);}
    private WebElement getCartButton () {return driver.findElement(cartButtonLocator);}

    private void openPageByUrl (){
        openPageByUrl(pagePath);
    }


}
