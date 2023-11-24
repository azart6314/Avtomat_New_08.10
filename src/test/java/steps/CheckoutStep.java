package steps;

import baseEntities.BasePage;
import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CheckoutInformationPage;
import pages.CheckoutOverviewPage;

public class CheckoutStep extends BaseStep {

    protected CheckoutInformationPage checkoutInformationPage;
    protected CheckoutOverviewPage checkoutOverviewPage;

    public CheckoutStep(WebDriver driver) {
        super(driver);
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
    }

    public void fillYourInformation (String firstName, String lastName, String postalCod) {
        checkoutInformationPage.getFirstName().sendKeys(firstName);
        checkoutInformationPage.getLastName().sendKeys(lastName);
        checkoutInformationPage.getPostalCod().sendKeys(postalCod);
    }

    public CheckoutOverviewPage continue1 () {
        checkoutInformationPage.getContinueButton().click();
        return new CheckoutOverviewPage(driver);
    }
}
