package baseEntities;

import Configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.UserStep;

public abstract class BasePage {
    //abstract - оставляет возможность не реализовывать какие то методы и заставить это реализовывать в дочерниъ методах

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected abstract By getPageIdentifier(); //каждый клас будет сам проверять что надо

    public boolean isPageOpened(){
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }

    //метод для перехода по страницам через урл
    public void openPageByUrl(String pagePath){
        driver.get(ReadProperties.getUrl()+ pagePath);
    }
}
