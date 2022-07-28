package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobileTopUpPage extends BasePage {

    public MobileTopUpPage(WebDriver driver) {
        super(driver);
    }


    private final By mobileWallet = By.xpath("//div[text()='My wallet']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardValidationTerm = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCVV = By.xpath("//input[@data-qa-node='cvvdebitSource']");

    private final By submitButton = By.xpath("//button[@data-qa-node='submit']");
    private final By errorPhoneNumber = By.xpath("//div[@class='sc-eNQAEJ jfFbcw  ']");



    public MobileTopUpPage selectCardFromWallet (){
        driver.findElement(mobileWallet).click();
        return this;
    }
    public MobileTopUpPage enterPhoneNumber (String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }
    public MobileTopUpPage enterAmount (String amount){
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    public MobileTopUpPage enterCard (String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }
    public MobileTopUpPage enterCardValidationTerm (String term){
        driver.findElement(inputCardValidationTerm).sendKeys(term);
        return this;
    }
    public MobileTopUpPage enterCVV (String cvv){
        driver.findElement(inputCVV).sendKeys(cvv);
        return this;
    }

    public MobileTopUpPage enterSubmitButton (){
        driver.findElement(submitButton).click();
        return this;
    }


    private final By cardholderName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    private final By cardholderSurname = By.xpath("//input[@data-qa-node='lastNamedebitSource']");

    public MobileTopUpPage enterCardholder (String name, String surname){
        driver.findElement(cardholderName).sendKeys(name);
        driver.findElement(cardholderSurname).sendKeys(surname);
        return this;
    }

    private final By paymentDetailsInCart = By.xpath("//div[@data-qa-node='details']");

    public WebElement paymentDetails (){
        return driver.findElement(paymentDetailsInCart);
    }

    public WebElement errorMobileDetails (){
        return driver.findElement(errorPhoneNumber);
    }





}


