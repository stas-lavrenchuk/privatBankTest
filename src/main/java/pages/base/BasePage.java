package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.loans.CarLoansPage;

import java.time.Duration;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {


    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    public void goToURL(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

   public void isAuthWidgetPresent() {
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);

    }

}