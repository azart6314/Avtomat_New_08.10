package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;

public class ProductsStep extends BaseStep {
    private ProductsPage productsPage;

    public ProductsStep(WebDriver driver) {
        super(driver);
        productsPage = new ProductsPage(driver);
    }
    //Add product: 2.1. Add first product to cart 2.2. Open page with second product 2.3. Add second product to cart
    // 2.4. Back to products 2.5. Add third product to cart 2.6. Open page with third product 2.7. Remove third product
    // 2.8. Back to products 2.9. Switch to cart

    public void addFirstProductToCart (){
        productsPage.getFirstProductAddCard().click();
    }
    public void openSecondProductCard () {
        productsPage.getSecondProductName().click();
    }
    public void addSecondProductToCart (){
        productsPage.getSecondProductAddCard().click();
    }

    public void backToProductsPage () {
        productsPage.getBackToProduct().click();
    }




}
