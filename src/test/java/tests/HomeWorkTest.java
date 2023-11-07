package tests;

import Factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }

    @Test
    public void CheckCorrectnessCalculations () throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

        driver.findElement(By.id("el_f_width")).sendKeys("10");
        driver.findElement(By.id("el_f_lenght")).sendKeys("10");

        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        Select selectRoomTyp = new Select(selectWebElement);

        selectRoomTyp.selectByValue("2");
        Thread.sleep(2000);

        WebElement selectWebElement2 = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(selectWebElement2);
        selectHeatingType.selectByValue("2");
        Thread.sleep(2000);

        driver.findElement(By.id("el_f_losses")).sendKeys("10");
        driver.findElement(By.name("button")).click();

        Assert.assertEquals(driver.findElement(By.id("floor_cable_power")).getAttribute("value"), "11");
        Assert.assertEquals(driver.findElement(By.id("spec_floor_cable_power")).getAttribute("value"), "0");


    }




}
