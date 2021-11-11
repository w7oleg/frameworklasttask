package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import waits.CustomConditions;

import java.time.Duration;

public class ComputeEngineUtils {
    private static long WAIT_TIMEOUT_SECONDS = 10;

    public static void active(WebDriver driver, WebElement iFrame, WebElement iFrameCalculatorAfterIFrame) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(CustomConditions.jsLoadCompleted());
        driver.switchTo().frame(iFrame);
        String linkPricingCalculatorPage = iFrameCalculatorAfterIFrame.getAttribute("src");
        driver.get(linkPricingCalculatorPage);
    }
}
