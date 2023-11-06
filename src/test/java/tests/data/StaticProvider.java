package tests.data;

import org.testng.annotations.DataProvider;

public class StaticProvider {


    @DataProvider(name = "dataForSum")
    public static Object[][] datsForSumTest() {
        return new Object[][]{
                {-2, -3, -5},
                {0, 0, 0},
                {2, 3, 5},

        };
    }

    @DataProvider(name = "dataFodDiv")
    public static Object [][] datsForDivTest() {
        return new Object[][] {
                {10, 2, 5},
                {20, 2, 10}
        };
    }
}
