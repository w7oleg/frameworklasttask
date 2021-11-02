package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import waits.CustomWebElementWaits;

public class LocatorUtils {
    public static WebElement positionElement(String locatorElement, String variable, WebDriver driver) {
        String locator = String.format(locatorElement, variable);
        return CustomWebElementWaits. waitPresenceOfElementLocatedAndElementToBeClickable(By.xpath(locator), driver);
    }
}
