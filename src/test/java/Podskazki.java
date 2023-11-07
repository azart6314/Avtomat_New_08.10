import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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










}
