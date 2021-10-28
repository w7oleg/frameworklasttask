package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CustomWebElementWaits {
    private static long WAIT_TIMEOUT_SECONDS = 10;

    public static WebElement waitBeforeChoosingMenuOption(By locator, WebDriver driver) {
        WebElement position = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(position));
        return position;
    }

    public static WebElement waitBeforeChoosingMenuOptionAfterClick(String locatorElement, String variable, WebDriver driver) {
        String locator = String.format(locatorElement, variable);
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public static WebElement waitBeforeChoosingMenuOptionAfterClick(WebElement element, WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static Boolean waitBeforeChoosingMenuOptionAfterClick(WebDriver driver){
       return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).withMessage("javascript didn't load")
                .until(CustomConditions.jsLoadCompleted());
    }

}
