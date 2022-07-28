package tests.telecomunications.negative;

import constants.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.telecomunications.MobileTopUpPage;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.MOBILE_PAYMENT_PHONE_INCORRECT_NUMBER;

public class MobileTopUpNegativeTest extends BaseTest {

    MobileTopUpPage mobileTopUpPage = new MobileTopUpPage(driver);

    @Test
    public void enterIncorrectNumber() {
        basePage.goToURL(Constant.Urls.MOBILE_TOP_UP_URL);
        mobileTopUpPage.enterPhoneNumber(MOBILE_PAYMENT_PHONE_INCORRECT_NUMBER);
        mobileTopUpPage.enterSubmitButton();
        Assertions.assertEquals(mobileTopUpPage.errorMobileDetails().getText(), "Incorrect value was entered");
    }

}
