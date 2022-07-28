package tests.loans.negative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.loans.CarLoansPage;
import tests.base.BaseTest;

import static constants.Constant.CarsLeasingTestData.LOWER_THAN_MIN_PRICE;
import static constants.Constant.Urls.CAR_LEASING_URL;


public class CarLeasingNegativeTest extends BaseTest {

    CarLoansPage carLoansPage = new CarLoansPage(driver);

    @Test
    public void applyCarsWithMileage () {
        basePage.goToURL(CAR_LEASING_URL);
        carLoansPage.selectOrderTab();
        carLoansPage.enterCarPrice(LOWER_THAN_MIN_PRICE);
        Assertions.assertEquals(carLoansPage.submitButtonElement().getAttribute("disabled"), "true");
    }
}
