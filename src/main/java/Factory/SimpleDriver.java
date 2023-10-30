package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriver {

    //Инициализируем здесь драйвер как скаченный дравйвер ( можно любой спицифически )
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\Teach_me_skills\\Avtomat_New_08.10\\Avtomat_New_08.10\\src\\test\\resources\\chromedriver.exe"); //указываем где хром драйвер
        return new ChromeDriver();
    }
}
