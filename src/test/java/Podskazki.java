import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Podskazki {

     //mvn clean test  - ЗАПУСКАЕТ ВСЕ ТЕСТЫ В ПРОЕКТЕ С АНАТАЦИЕЙ @Test

// Assert.   -- очень много методов для проверок
    //true -если проверить актуальный результат
    //Equals  - сравнить ожидаемый и вактический результат
    //Assert.assertEquals(calculator.sum(2, 3), 5, "Невернная сумма ..."); -- коментарий появляется если не прошли проверку

               //Параметры аннотаций (Атрибуты анатаций)

    //@Test(enabled = false) - атрибут enabled анатаций говорит доступен тест или нет ( тру фолс)

    //@Test(description = "Тест с описанием") - атрибут  description добовляет описание в репортЕ ( посмотреть: удалить папку таргет
                                                                                          // 1) mvn clean test 2) Открыть таргет 3)Откр surefire - reports 4)index.html 5) Выбрать браузер 6) ПОСЛЕ ПРОСМОТРА УДАЛИТЬ ПАПКУ ТАРГЕТ
    //@Test(testName = "Тест с названием") - в тест репорте метод переименуется на имя ( отображается в терменале)

    // @Test(timeOut = 1000) - устанавливает время за которое должен пройти тест Если тест не успел пройти он считается не пройденый  ( измеряется в мили секундах)

    // Thread.sleep(500); - команда которая затормаживает выполнение на указанные мили секунды

    //@Test(invocationCount = 3) - выполняет данные тест указанное количество раз

    //@Test(invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3) invocationTimeOut - что все 3 теста должны выполниться за указанное время (Они сумируются все 3 в 1)
                                                          //threadPoolSize = 3   распоролелить 3 потока

    //@Test(dependsOnMethods = "stepb") //dependsOnMethods = "stepb"- от какого теста зависит этот и после кого он выполняется , в какой последовательности и если предыдущий падает то этот не выполняется

    //@Test(dependsOnMethods = "stepa", alwaysRun = true) //alwaysRun - всегда выполнять в независимости от того упал превед тест или нет

    //@Test(dependsOnMethods = {"stepd", "stepa"}) // ставим{} и указываем от каких методов может зависит от одного или второго

    //@Test (priority = 1) //priority = 1 -начальное значение 0 у всех

    //@Test (groups = "smoke") - указываем группу тестов для запуска ее по группам  Так же можно указывать несколько групп

    //@Test (retryAnalyzer = Retry.class) когда сделан Retry и указываем что тест retryAnalyzer повторяется энное количество раз



//    @Test (expectedExceptions = NullPointerException.class) //expectedExceptions - ожидаемый результат, если он пришел то тест пройдет
//    public void exceptionTest() {
//        List list = null;
//        int size = list.size();
//    }

                //Параметризованные тесты

//    @Test(dataProvider = "dataForSum", dataProviderClass = StaticProvider.class, threadPoolSize = 2) //dataProvider = "dataForSum" - имя дата провайдера. dataProviderClass = StaticProvider.class - указываем класс где содержиться этот метот
//    public void testSum(int a, int b, int expected) {
//        Assert.assertEquals(calculator.sum(a, b), expected, "Невернная сумма ...");
//    }


//    @Parameters({"Login-value", "psw-value"}) //Это мы указываем в resources файле параметры
//    @Test
//    public void paramTest(@Optional("default_user") String Login, //@Optional - позваляет использовать когда отлаживается тест без переданных параметров. Если будет тест через тестнджи то значения будут браться от туда
//                          @Optional("123") String psw) {
//        System.out.println("Login is:" +Login);
//        System.out.println("Psw is:" +psw);
//    }

                     //4 Урок Selenium
     //driver.quit();  //секция закрывает браузер если нету команды в диспечере надо убить процесс



                    //5 Урок
//         WebDriver – действия
//   driver.get("http://onliner.by");  -- Открыть Браузер/URL
//   driver.close(); -- Закрыть вкладку браузера
//   driver.quit(); -- Закрыть браузер
//   driver.manage().window(). - работа с размерами экран
//   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); - работа с ожиданиями ( можно делать в браузер фэктори)

//                    Локаторы
//    driver.findElement(By.id(""));
//  driver.findElement(By.name(""));
//  driver.findElement(By.className(""));
//  driver.findElement(By.tagName(""));
//  driver.findElement(By.linkText(""));
//  driver.findElement(By.partialLinkText(""));
//  driver.findElement(By.cssSelector(""));
//  driver.findElement(By.xpath(""));

//                           WebElement – основные действия
//    WebElement element = driver.findElement(By.id("some-id"));
//    element.click(); - Клик
//    element.sendKeys("text"); -  Введение текста
//    element.submit(); - Подтверждение формы
//    element.clear(); - Очистка текста внутри элемента
//    driver.findElement(By.id("oCr")).sendKeys("80"); // можно не создавать веб элемент и сразу его заполнить
//    weightInput.sendKeys(Keys .); - использование разных клавишь


//                               sELECT
//        electSex.selectByIndex(1); // хранится как масив в drop daun
//        selectSex.selectByValue("0");
//        selectSex.selectByVisibleText("женский")
//        select.deselectAll(); - позволяет сбросить все выбранные значения
//        select.getAllSelectedOptions(); - позволяет вернуть список опций в данный момент
//        selectSex.deselectAll(); - позволяет отменить выбор
//        select.getFirstSelectedOption(); - выбрать первую выбранную опцию
//        select.getOption(); - получить список всех возможных значений данного поля
//        selectSex.getWrappedElement() - получить обратно веб элемент который создан в селекте
//        selectSex.isMultiple(); - позволяет ли поле выбирать несколько значений или только одно можно


                                //`Assert.assertTrue` и `Assert.assertEquals`

            //Используйте Assert.assertEquals, когда нужно точно сравнить два значения.
            //Используйте Assert.assertTrue, когда проверяется булево условие или выражение.
                    //Истину
    //1. `Assert.assertTrue` - Этот метод принимает булево значение (true или false) и проверяет, что оно истинно.
    // Если переданное значение истинно, то тест будет продолжаться без ошибок. Если значение ложно, то тест будет прерван
    // и отмечен как неудачный.
    //Assert.assertTrue(driver.findElement(By.cssSelector("div.intro")).isDisplayed());

                    //Равенство
    //2. `Assert.assertEquals` - Этот метод сравнивает два значения на равенство. Если значения равны, то тест продолжится без ошибок.
    // Если значения отличаются, то тест будет прерван и отмечен как неудачный, а также будет выведено сообщение с информацией об отличиях.
    //  Assert.assertEquals(6, driver.findElements(By.cssSelector("h1, p")).size(), 8);

                                //Селекторы
    //<p href=”value”> (p -тег; href- атрибут; value -значение атрибута)

//    Поиск элемента по id: "[id='yourId']"
//    Поиск элемента по name: "[name='yourName']"
//    Поиск элемента по classname: ".yourClassName"
//    Поиск элемента по tagname: "yourTagName"
//    Поиск элемента по тексту ссылки: "a:contains('Your Link Text')"
//    Поиск элемента по XPath: "yourXPath"

//                        XPath-запросы.
//    Поиск по атрибуту: $$("//tag[@attribute='value']")
//    Поиск по тексту: $$("//tag[text()='text']")
//    Поиск по частичному совпадению атрибута: $$("//tag[contains(@attribute,'text')]")
//    Поиск по частичному совпадению текста: $$("//tag[contains(text(),'text')]")
//    Поиск с использованием ancestor: $$("//*[text()='Enterprise Testing']//ancestor::div")
//    Поиск с использованием descendant: $$("//tag[text()='Parent']//descendant::childTag")
//    Поиск с использованием following: $$("//tag[text()='Current']//following::nextTag")
//    Поиск с использованием parent: $$("//tag[text()='Child']//parent::parentTag")
//    Поиск с использованием preceding: $$("//tag[text()='Current']//preceding::prevTag")
//    Поиск элемента с условием AND: $$("//input[@class='_2zrpKA _1dBPDZ' and @type='text']")




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


////    Поиск по id
////    devToll - [id='My-Address']  Для css селектора
////    это написание одно и тоже как и By.id("my-Address") // ищем в Тузлз #my-Address что бы убедиться в уникальности
//        Assert.assertTrue(driver.findElement(By.cssSelector("#my-Address")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.id("my-Address")).isDisplayed()); //два одинаковых варианта разное написание
//
//    //Поиск по class name. Если хотим найти только один из наме используем в дев туле точку .newsletter (может быть несколько клас наме если там есть пробел)
//        Assert.assertTrue(driver.findElement(By.cssSelector(".newsletter")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.className("newsletter")).isDisplayed());
//
//    //Поск по нескольким значением в атрибудет class (значений может быть сколько угодно)
//    // devToll .newsletter.noSel - порядок не имеет значения количество как угодно ставим только через точку
//        Assert.assertTrue(driver.findElement(By.cssSelector(".newsletter.noSel")).isDisplayed());
//
//    //Поск по tage name
//    //devToll - //h1  ( две палочки для поиска)
//        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());// именно поиск по тэгу
//        Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
//
//    //Поск по tage name и значению class name
//    //devToll - div.intro  или tage name and id - p#my-Address
//        Assert.assertTrue(driver.findElement(By.cssSelector("div.intro")).isDisplayed());
//
//    //поиск нескольких элементо
//    //Поск элемента по clsass name c с учетом иерархий
//    //devToll - #Lastname .markup (с пробелом между id и classname )  еще - .intro .markup (по ирархий будет от радительской к дочерней в рамках родительского элемента)
//        Assert.assertEquals(6, driver.findElements(By.cssSelector("#Lastname .markup")).size(), 2); //size потмоу что много элементов на странице таких
//
//    //Поск всех элементов с tagname h1 OR(логичиское или) p
//    //devToll - h1, p (с пробелом после запятой)
//        Assert.assertEquals(6, driver.findElements(By.cssSelector("h1, p")).size(), 8);
//
//    // Поиск всех элементов с тэгом p у которых непосредственный родитель с тэгом div  ( откроется ближайше p к div)
//    // devToll - div > p  ( найдутся все p которые идут сразу div от не последственного родителя)
//        Assert.assertEquals(6, driver.findElements(By.cssSelector("div > p")).size());
//
//    // Поиск всех элементов с тэгом p которые идут сразу за элементом с тэго ul
//    // devToll - ul + p
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("ul + p")).size());
//
//    // Поиск всех элементов у которых присутствует атрибут Lang  (Имя отрибуда и его значение)
//    // devToll - [lang='it'] так же можно в начале ставить любые тэги и т.д - p[lang='it']
//    // devToll - p[lang] ( Чисто тэги и атрибут без значение)
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("p[lang]")).size());
//
//    // Поиск всех элементов у которых присутствует аттрибут style с конкретным значением
//    // devToll - [style='overflow: auto;']
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("[style='overflow: auto;']")).size());
//
//    // Поиск всех элементов у которых присутствует аттрибут id со значением заканчивающимся на какое-то value
//    // devToll - [id$='ess']
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id$='ess']")).size());
//
//    // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то value
//    // devToll - [id^=L]
//        Assert.assertEquals(2, driver.findElements(By.cssSelector("[id^=L]")).size());
//
//    // Поиск всех элементов у которых присутствует аттрибут id с начинающимся словом value. Когда есть несколько слов
//    // devToll - [id|=my]
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id|=my]")).size());
//
//    // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим слово целиком
//    // devToll - [title~=beautiful]  (тильда позволяет искать просто содержащее слово целиком)
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title~=beautiful]")).size());
//    /////
//
//    // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим подстроку
//    // devToll - [title*='o beautiful'] (ищет просто по под строке)
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title*='o beautiful']")).size());
//
//
//
//    //Поиск свойст нейких элементов ( начинается с :)
//
//    // Поиск всех свойств disabled элементов
//    // devToll - :disabled  (не кликабельный элемент на странице)
//    // Также можно комбенировать - input#rr3[name='rr']:disabled (тэг id name и что элемент хадизеблен)
//        Assert.assertEquals(1, driver.findElements(By.cssSelector(":disabled")).size());
//
//    // Поиск всех enabled элементов
//    // devToll - :enabled  (элементы которые доступны)
//        Assert.assertEquals(8, driver.findElements(By.cssSelector(":enabled")).size());
//
//    // Поиск всех выборанных элементов (выбранные чек боксы не выбранный не будет искать)
//    // devToll -:checked
//        Assert.assertEquals(2, driver.findElements(By.cssSelector(":checked")).size());
//
//    // Поиск всех элементов c пустым телом без вложений (тег не расскрывается)
//    // devToll - :empty
//        Assert.assertEquals(16, driver.findElements(By.cssSelector(":empty")).size());
//
//
//    //Вещи работающие с css
//
//    // Поиск элемента с тэгом p и которым является первым дочерним элементом
//    // devToll - p:first-child (p тег ) (первый из списка тегов самый первый из всех которые есть на сайте )
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:first-child")).size());
//
//    // Поиск элемента с тэгом p и которым является последним дочерним элементом
//    // devToll - p:last-child
//        Assert.assertEquals(2, driver.findElements(By.cssSelector("p:last-child")).size());
//
//    // Поиск элемента с тэгом p и которым является n-ым дочерним элементом
//    // devToll - p:nth-child(2)
//        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:nth-child(2)")).size());


                            //XPath ЛОКАТОРЫ

//     driver.get("D:\\Teach_me_skills\\Avtomat_New_08.10\\Avtomat_New_08.10\\src\\test\\resources\\index.html");
//
//    //https://www.w3schools.com/xml/xpath_axes.asp
//    // 6урок 2.00
//
//    // - /.. подняться на уровень выше
    //devToll- //div[text()='Sauce Labs Backpack']  - поиск по тексту на страницу 1.Тэг 2.Текст на странице
    // <div class="inventory_item_name">Sauce Labs Backpack</div> пример со страницы
//
//    // Поиск родителя у элемента с тэгом h1
//    //devToll-  //span[@id='Lastname']/parent::* (пример из урока)
//        Assert.assertTrue(driver.findElement(By.xpath("//h1/..")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//h1/parent::*")).isDisplayed());
//
//    // Поиск всех предков с тэгом div у элемента с тэгом h1
//    //devToll- //span[@id='Lastname']/ancestor::*
//        Assert.assertTrue(driver.findElement(By.xpath("//h1/ancestor::div")).isDisplayed());
//
//    // Использование child - непосредственно дочерние элементы с тэго a от div
//    // devToll- //span[@id='Lastname']/span  (пример из урока)
//        Assert.assertTrue(driver.findElement(By.xpath("//div/a")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//div/child::a")).isDisplayed());
//
//    // Использование child - все дочерние элементы с тэго a от div
//        Assert.assertTrue(driver.findElement(By.xpath("//div//a")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//div/descendant::a")).isDisplayed());
//
//    //Использование following - Выбирает всё в документе после закрытия тэга текущего узла
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='dialog-title']/following::form")).isDisplayed());
//
//    //Использование preceding- Выбирает все узлы, которые появляются перед текущим узлом в документе
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@class=\"dialog-title\"]/preceding::form")).isDisplayed());
//
//    //Использование preceding-sibling - Выбирает все узлы одного уровня до текущего узла
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='dialog-title']/preceding-sibling::form")).isDisplayed());


                                //8 урок











}
