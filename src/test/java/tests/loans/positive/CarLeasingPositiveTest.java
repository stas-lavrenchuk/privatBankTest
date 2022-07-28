package tests.loans.positive;

import org.junit.jupiter.api.Test;
import pages.loans.CarLoansPage;
import tests.base.BaseTest;

import static constants.Constant.CarsLeasingTestData.*;
import static constants.Constant.Urls.CAR_LEASING_URL;

public class CarLeasingPositiveTest extends BaseTest {

    CarLoansPage carLoansPage = new CarLoansPage(driver);

    @Test
    public void applyCarsWithMileage () {
        basePage.goToURL(CAR_LEASING_URL);
        carLoansPage.selectOrderTab();
        carLoansPage.enterCarPrice(CAR_PRICE);
        carLoansPage.enterPrepayment(CAR_PREPAYMENT);
        carLoansPage.clickOnThePhonesCode();
        carLoansPage.enterCountryName(COUNTRY_NAME);
        carLoansPage.enterCountryCodeSearchResult();
        carLoansPage.enterPhoneNumber(PHONE_NUMBER);
        carLoansPage.submitButtonElement().click();
    }




    @Test
    public void goToTheTabAgreements(){
        basePage.goToURL(CAR_LEASING_URL);
        carLoansPage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();

    }

}
