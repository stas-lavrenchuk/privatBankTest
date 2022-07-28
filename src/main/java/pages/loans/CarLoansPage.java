package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class CarLoansPage extends BasePage {
    public CarLoansPage(WebDriver driver) {
        super(driver);
    }

    public final By tabAgreements = By.xpath("//div[text()='Agreements']");
    public final By tabOrder = By.xpath("//div[@class='item_ryTYvf_Qfl active_Wr2DF7fJ2P']");
    public final By inputCarPrice = By.xpath("//input[@data-qa-node='amount']");
    public final By inputPrepayment = By.xpath("//input[@data-qa-node='prepaid']");
    public final By phoneNumberCode = By.xpath("//button[@data-qa-node='phone-code']");
    public final By inputCountryName = By.xpath("//div[@data-qa-node='phone-code-list']//input");
    public final By countryCodeSearchResult = By.xpath("//button[@data-qa-node='phone-code-option']");
    public final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    public final By submitButton = By.xpath("//div[@class='sc-gqjmRU kwLFLd']//button");

    public CarLoansPage selectAgreementsTab() {
        driver.findElement(tabAgreements).click();
        return this;
    }

    public CarLoansPage selectOrderTab() {
        driver.findElement(tabOrder).click();
        return this;
    }

    public CarLoansPage enterCarPrice(String price) {
        driver.findElement(inputCarPrice).click();
        driver.findElement(inputCarPrice).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
                Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        driver.findElement(inputCarPrice).sendKeys(price);
        return this;
    }

    public CarLoansPage enterPrepayment(String prepayment) {
        driver.findElement(inputPrepayment).click();
        driver.findElement(inputPrepayment).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
                Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
        driver.findElement(inputPrepayment).sendKeys(prepayment);
        return this;
    }

    public CarLoansPage clickOnThePhonesCode() {
        driver.findElement(phoneNumberCode).click();
        return this;
    }
    public CarLoansPage enterCountryName (String country){
        driver.findElement(inputCountryName).sendKeys(country);
        return this;
    }
    public CarLoansPage enterCountryCodeSearchResult (){
        driver.findElement(countryCodeSearchResult).click();
        return this;
    }
    public CarLoansPage enterPhoneNumber (String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    public WebElement submitButtonElement(){
        return driver.findElement(submitButton);
    }

}
