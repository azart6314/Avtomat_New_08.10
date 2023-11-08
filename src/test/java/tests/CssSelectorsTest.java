package tests;

import Factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelectorsTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    //6 урок начало лекций (сайт в ресерсах лежит взятый с https://www.w3schools.com/cssref/css_selectors.php)

    @Test
    public void cssLocatorTest() {
        driver.get("D:\\Teach_me_skills\\Avtomat_New_08.10\\Avtomat_New_08.10\\src\\test\\resources\\index.html");

             //<p href=”value”> (p -тег; href- атрибут; value -значение атрибута)
  // id - #id (By.cssSelector); - [id='My-Address']  (By.cssSelector); - id (By.id)
  // class name - .newsletter (cssSelector)можно множество; - newsletter (className);
  // tage name - //h1 (cssSelector и tagName) по селектору именно этот тэг в не текста
  // tage name и значению атрибута - div.intro (cssSelector) 1.тэг 2.значение атрибута
  // tage name and id - p#my-Address (cssSelector) 1.тэг 2.id
  // id и значению атрибута - #Lastname .markup (cssSelector) 1.id пробел 2.значение атрибута
  // по двум значения атрибата в иерархий - .intro .markup (cssSelector) в начале родительское значение атрибута потом ниже  значение атрибута
  // Поск всех элементов с tagname <h1 OR(логичиское или) <p - h1, p (cssSelector) 1.тэг пробел 2.тэг
  // Поиск родительского и подротительского tage - div > p (cssSelector); 1.Родительский tag 2.Подродительский TAG
  // Поиск всех элементов с тэгом P которые сразу идут за тэгом ul - ul + p (cssSelector) 1.Тэг плюс 2.подродительский тэг
  // Поиск по атрибуду и его значению - [lang='it'] (cssSelector); в начале можно указать тэг p[lang='it']
  // Поиск по Тэгу и Атрибуту -  p[lang] (cssSelector) Чисто тэги и атрибут без значение
  // Поиск по всем одинаковым Атрибутам и Его значением - [style='overflow: auto;'] (cssSelector); 1.Атрибут 2.Все его значения
  // Поиск по ID со часть окончания его значения - [id$='ess'] (cssSelector); 1.ID 2.концовказначения Атрибута
  // Поиск по ID с начаниющей частью Атрибута - [id^=L] (cssSelector); 1.ID 2.начало Атрибута


        //Поиск по id
        //devToll - [id='My-Address']  Для css селектора
        //это написание одно и тоже как и By.id("my-Address") // ищем в Тузлз #my-Address что бы убедиться в уникальности
        Assert.assertTrue(driver.findElement(By.cssSelector("#my-Address")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("my-Address")).isDisplayed()); //два одинаковых варианта разное написание

        //Поиск по class name. Если хотим найти только один из наме используем в дев туле точку .newsletter (может быть несколько клас наме если там есть пробел)
        Assert.assertTrue(driver.findElement(By.cssSelector(".newsletter")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("newsletter")).isDisplayed());

        //Поск по нескольким значением в атрибудет class (значений может быть сколько угодно)
        // devToll .newsletter.noSel - порядок не имеет значения количество как угодно ставим только через точку
        Assert.assertTrue(driver.findElement(By.cssSelector(".newsletter.noSel")).isDisplayed());

        //Поск по tage name
        //devToll - //h1  ( две палочки для поиска)
        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());// именно поиск по тэгу
        Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());

        //Поск по tage name и значению class name
        //devToll - div.intro  или tage name and id - p#my-Address
        Assert.assertTrue(driver.findElement(By.cssSelector("div.intro")).isDisplayed());

        //поиск нескольких элементо
        //Поск элемента по clsassname c с учетом иерархий
        //devToll - #Lastname .markup (с пробелом между id и classname )  еще - .intro .markup (по ирархий будет от радительской к дочерней в рамках родительского элемента)
        Assert.assertEquals(6, driver.findElements(By.cssSelector("#Lastname .markup")).size(), 2); //size потмоу что много элементов на странице таких

        //Поск всех элементов с tagname <h1 OR(логичиское или) <p
        //devToll - h1, p (с пробелом после запятой)
        Assert.assertEquals(6, driver.findElements(By.cssSelector("h1, p")).size(), 8);

        // Поиск всех элементов с тэгом p у которых непосредственный родитель с тэгом div  ( откроется ближайше p к div)
        // devToll - div > p  ( найдутся все p которые идут сразу div от не последственного родителя)
        Assert.assertEquals(6, driver.findElements(By.cssSelector("div > p")).size());

        // Поиск всех элементов с тэгом p которые идут сразу за элементом с тэго ul
        // devToll - ul + p
        Assert.assertEquals(1, driver.findElements(By.cssSelector("ul + p")).size());

        // Поиск всех элементов у которых присутствует атрибут Lang  (Имя отрибуда и его значение)
        // devToll - [lang='it'] так же можно в начале ставить любые тэги и т.д - p[lang='it']
        // devToll - p[lang] ( Чисто тэги и атрибут без значение)
        Assert.assertEquals(1, driver.findElements(By.cssSelector("p[lang]")).size());

        // Поиск всех элементов у которых присутствует аттрибут style с конкретным значением
        // devToll - [style='overflow: auto;']
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[style='overflow: auto;']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением заканчивающимся на какое-то value
        // devToll - [id$='ess']
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id$='ess']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то value
        // devToll - [id^=L]
        Assert.assertEquals(2, driver.findElements(By.cssSelector("[id^=L]")).size());

        // Поиск всех элементов у которых присутствует аттрибут id с начинающимся словом value. Когда есть несколько слов
        // devToll - [id|=my]
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id|=my]")).size());

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим слово целиком
        // devToll - [title~=beautiful]  (тильда позволяет искать просто содержащее слово целиком)
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title~=beautiful]")).size());
        /////

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим подстроку
        // devToll - [title*='o beautiful'] (ищет просто по под строке)
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title*='o beautiful']")).size());



        //Поиск свойст нейких элементов ( начинается с :)

        // Поиск всех свойств disabled элементов
        // devToll - :disabled  (не кликабельный элемент на странице)
        // Также можно комбенировать - input#rr3[name='rr']:disabled (тэг id name и что элемент хадизеблен)
        Assert.assertEquals(1, driver.findElements(By.cssSelector(":disabled")).size());

        // Поиск всех enabled элементов
        // devToll - :enabled  (элементы которые доступны)
        Assert.assertEquals(8, driver.findElements(By.cssSelector(":enabled")).size());

        // Поиск всех выборанных элементов (выбранные чек боксы не выбранный не будет искать)
        // devToll -:checked
        Assert.assertEquals(2, driver.findElements(By.cssSelector(":checked")).size());

        // Поиск всех элементов c пустым телом без вложений (тег не расскрывается)
        // devToll - :empty
        Assert.assertEquals(16, driver.findElements(By.cssSelector(":empty")).size());


        //Вещи работающие с css

        // Поиск элемента с тэгом p и которым является первым дочерним элементом
        // devToll - p:first-child (p тег ) (первый из списка тегов самый первый из всех которые есть на сайте )
        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:first-child")).size());

        // Поиск элемента с тэгом p и которым является последним дочерним элементом
        // devToll - p:last-child
        Assert.assertEquals(2, driver.findElements(By.cssSelector("p:last-child")).size());

        // Поиск элемента с тэгом p и которым является n-ым дочерним элементом
        // devToll - p:nth-child(2)
        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:nth-child(2)")).size());



    }


}