package constants;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls {
        public static final String MOBILE_TOP_UP_URL = "https://next.privat24.ua/mobile?lang=en";
        public static final String CAR_LEASING_URL = "https://next.privat24.ua/auto-credit/order?lang=en";
    }

    public static class MobileReplenishmentTestData {
        public static final String MOBILE_PAYMENT_PHONE_NUMBER = "686979712";
        public static final String MOBILE_PAYMENT_PHONE_INCORRECT_NUMBER = "1114";
        public static final String MOBILE_PAYMENT_MIN_AMOUNT = "1";


    }

    public static class CarsLeasingTestData {
        public static final String CAR_PRICE = "150001";
        public static final String LOWER_THAN_MIN_PRICE = "149999";
        public static final String CAR_PREPAYMENT = "50000";
        public static final String COUNTRY_NAME = "Georgia";
        public static final String PHONE_NUMBER = "000000000";
    }

    public static class Cards {
        public static final String MOBILE_PAYMENT_CARD = "4006895689048337";
        public static final String MOBILE_PAYMENT_CARD_TERM = "0323";
        public static final String MOBILE_PAYMENT_CARD_CVV = "480";
        public static final String MOBILE_PAYMENT_CARDHOLDER_NAME = "Peter";
        public static final String MOBILE_PAYMENT_CARDHOLDER_SURNAME = "Edwards";
    }
}
