package tests.telecomunications.positive;
import constants.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.telecomunications.MobileTopUpPage;
import tests.base.BaseTest;

import static constants.Constant.Cards.*;
import static constants.Constant.MobileReplenishmentTestData.*;

public class MobileTopUpPositiveTest extends BaseTest {

    MobileTopUpPage mobileTopUpPage = new MobileTopUpPage(driver);

  @Test
    public void checkIsRedirectToAuth(){
        basePage.goToURL(Constant.Urls.MOBILE_TOP_UP_URL);
        mobileTopUpPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentSum(){
        basePage.goToURL(Constant.Urls.MOBILE_TOP_UP_URL);
        mobileTopUpPage.enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount(MOBILE_PAYMENT_MIN_AMOUNT)
                .enterCard(MOBILE_PAYMENT_CARD)
                .enterCardValidationTerm(MOBILE_PAYMENT_CARD_TERM)
                .enterCVV(MOBILE_PAYMENT_CARD_CVV);

        mobileTopUpPage.enterCardholder(MOBILE_PAYMENT_CARDHOLDER_NAME,
                MOBILE_PAYMENT_CARDHOLDER_SURNAME);

        mobileTopUpPage.enterSubmitButton();

       Assertions.assertEquals(mobileTopUpPage.paymentDetails().getText(),
               "Mobile payment. Phone number +380686979712");

    }



}
