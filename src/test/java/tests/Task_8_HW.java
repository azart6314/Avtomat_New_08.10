package tests;

import Factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_8_HW {
    private WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new BrowserFactory().getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void addItemCartTest() {
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.cssSelector("[id='user-name']")).sendKeys("standard_user");


        driver.findElement(By.cssSelector("[id='password']")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed());
        driver.findElement(By.cssSelector(".submit-button")).click();

        //проверка отображения товаров
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_4_title_link > div.inventory_item_name ")).isDisplayed());
        Assert.assertEquals(6, driver.findElements(By.cssSelector(".inventory_item_name")).size(),6);

        //добавление товаров в корзину
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        WebElement addProduct = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        addProduct.click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.cssSelector("[name='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();

        //проверка каунтера
        //Assert.assertEquals(driver.findElement(By.cssSelector("[class='shopping_cart_badge']")).getAttribute("value"),"6");

        //переход в корзину
        driver.findElement(By.cssSelector("#shopping_cart_container")).click();

        //проверка товара в корзине

        //1 товар Sauce Labs Backpack
        //Название товара по id
        Assert.assertEquals(driver.findElement(By.id("item_4_title_link")).getText(),"Sauce Labs Backpack");
        Assert.assertEquals(driver.findElement(By.cssSelector("#item_4_title_link .inventory_item_name")).getText(),
                "Sauce Labs Backpack");
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed(),
                "Sauce Labs Backpack");
        Assert.assertEquals("$29.99",
                driver.findElement(By.xpath("//div[text()='29.99']")).getText());

        //2 товар - Sauce Labs Bike Light

        Assert.assertEquals(driver.findElement(By.id("item_0_title_link")).getText(),
                "Sauce Labs Bike Light");
        Assert.assertEquals(driver.findElement(By.cssSelector("#item_0_title_link .inventory_item_name")).getText(),
                "Sauce Labs Bike Light");
        Assert.assertEquals("$9.99",
                driver.findElement(By.xpath("//div[text()='9.99']")).getText());











    }


}
