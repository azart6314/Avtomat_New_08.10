package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.data.StaticProvider;

public class HwCalculatorTest extends BaseTest {

    @Test (enabled = false)
    public void testDivisionInt1 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5, "Не верно");
    }

    @Test (description = "Добавил описание")
    public void testDivisionInt2(){
        Assert.assertEquals(calculator.divisionDouble(10, 2), 5, "Не обязательно сообщение");
    }

    @Test(priority = 1)
    public void testDivisionInt3 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5);
    }

    @Test(dependsOnMethods = "testDivisionInt4")
    public void testDivisionInt5 () {
        Assert.assertEquals(calculator.divisionInt(12, 2), 6, "чет не то пошло");
    }

    @Test(priority = 2)
    public void testDivisionInt4 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5);
    }

    @Test
    public void testDivisionInt6 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5, "заведомо Не верный ответ для запуска 7");
    }

    @Test(alwaysRun = true, dependsOnMethods = "testDivisionInt6")
    public void testDivisionInt7 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5, "Не верный ответ");
    }

    @Test(groups = "one")
    public void testDivisionInt8 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5);
    }

    @Test (groups = "one")
    public void testDivisionInt9 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5);
    }

    @Test(invocationCount = 2)
    public void testDivisionInt10 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5);
    }

    @Test(invocationCount = 2, invocationTimeOut = 2)
    public void testDivisionInt11 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5);
    }

    @Test(threadPoolSize = 2)
    public void testDivisionInt12 () {
        Assert.assertEquals(calculator.divisionInt(10, 2), 5);
    }

    @Test(dataProvider = "dataFodDiv", dataProviderClass = StaticProvider.class, threadPoolSize = 2)
    public void testDivisionInt13( int a, int b, int expected) {
        Assert.assertEquals(calculator.divisionInt(a, b), expected, "Все пошло по жопе");
    }



}
