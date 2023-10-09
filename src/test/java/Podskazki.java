import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.data.StaticProvider;

import java.util.List;

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







}
