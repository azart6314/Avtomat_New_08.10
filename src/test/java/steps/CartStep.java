package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.ProductsPage;

public class CartStep extends BaseStep {
protected   CartPage cartPage;

    public CartStep(WebDriver driver) {
        super(driver);
        CartPage cartPage = new CartPage(driver);
    }
    // Work with cart:
    //   3.1. Check first product
    //   3.2. Check second product
    //   3.3. Remove second product
    //   3.4. Continue shopping
    //   3.5. Add second product to cart
    //   3.6. Switch to cart
    //   3.7. Check first product
    //   3.8. Check second product
    //   3.9. Checkout

    public String getFirstProductName () {
        return   cartPage.getFirstProductName().getText();
    }

    public String getSecondProductName () {
        return cartPage.getSecondProductName().getText();
    }

    public void getSecondProductBatonRemove () {cartPage.getBatonSecondProductRemove().click();}

    public ProductsPage goToContinueShopping (){
        cartPage.continueShopping().click();
        return new ProductsPage(driver);

    }







}
