package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class HomeWork extends BaseTest {

    @Test
    public void contextMenuTest() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(By.id("hot-spot")))
                .contextClick()
                .build()
                .perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"You selected a context menu");
        alert.accept();
    }

    @Test
    public void DynamicControls () {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.cssSelector("[onclick='swapCheckbox()']")).click();
        //waitsService.waitForVisibilityID(By.id("message")).isDisplayed(); // проверил по id а надо по тексту
        Assert.assertEquals(waitsService.waitForVisibilityID(By.id("message")).getText(), "It's gone!");
        Assert.assertTrue(waitsService.waitForElementInvisibleCss(By.cssSelector("[type='checkbox']")));
        Assert.assertFalse(driver.findElement(By.cssSelector("[type='text']")).isEnabled());
        driver.findElement(By.cssSelector("[onclick='swapInput()']")).click();
        Assert.assertEquals(waitsService.waitForVisibilityID(By.id("message")).getText(), "It's enabled!");
    }

    @Test
    public void fileUploadTest () {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileUploadElement = waitsService.waitForExists(By.xpath("//input[@type='file']"));
        String pathToFile = ActionsTest.class.getClassLoader().getResource("download.jpeg").getPath().substring(1);
        fileUploadElement.sendKeys(pathToFile);
        waitsService.waitForVisibilityBy(By.id("file-submit")).submit();
        Assert.assertEquals(waitsService.waitForVisibilityBy(By.id("uploaded-files")).getText().trim(), //trim обрубает пробелы по концам
                "download.jpeg");
    }

    @Test
    public void framesTest(){
        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.xpath("//a[@href='/iframe']")).click();
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//p[. = 'Your content goes here.']")).isDisplayed();
        driver.findElement(By.xpath("//p[. = 'Your content goes here.']")).sendKeys("12345");
        driver.switchTo().defaultContent();

    }
}
