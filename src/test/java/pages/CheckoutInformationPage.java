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
    public WebElement getFirstName (){return driver.findElement(firstNameLocator);}
    public WebElement getLastName (){return driver.findElement(lastNameLocator);}
    public WebElement getPostalCod (){return driver.findElement(postalCodLocator);}

    public WebElement getCancelButton () {return driver.findElement(cancelButtonLocator);}
    public WebElement getContinueButton (){return driver.findElement(continueButtonLocator);}
    public WebElement getCartButton () {return driver.findElement(cartButtonLocator);}

    public void openPageByUrl (){
        openPageByUrl(pagePath);
    }


}
