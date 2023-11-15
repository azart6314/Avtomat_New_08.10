package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends BasePage {
    //описание локаторов
    private final By pageNameLocator = By.xpath("//span[text()='Checkout: Overview']");

    private final By firstProductNameLocator = By.xpath("//div[text()='Sauce Labs Backpack']");
    private final By secondProductNameLocator = By.xpath("//div[text()='Sauce Labs Bike Light']");
    private final By cancelButtonLocator = By.id("cancel");
    private final By finishButtonLocator = By.id("finish");

    private final By itemTotalPriceLocator = By.className("summary_subtotal_label");
    private final By totalPriceLocator = By.className("summary_total_label");







    //Инициализация страницы
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageNameLocator;
    }

    //атомарные методы
    public By getFinishButtonLocator() {
        return finishButtonLocator;
    }

    public By getCancelButtonLocator() {
        return cancelButtonLocator;
    }

    public By getFirstProductNameLocator() { return firstProductNameLocator; }
    public By getSecondProductNameLocator() { return secondProductNameLocator; }
    public By getItemTotalPrice() { return itemTotalPriceLocator; }
    public By getTotalPrice() { return totalPriceLocator; }
}
