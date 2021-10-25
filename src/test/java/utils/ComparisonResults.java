package utils;

import model.ProcessData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static waits.CustomWebElementWaits.waitBeforeChoosingMenuOptionAfterClick;

public class ComparisonResults {

    private static boolean result;

    public static boolean comparisonResultsEmailWithDataSite(String universalAddress, String element, WebDriver driver){
        WebElement position = waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver);
        String priceReceivedEmail = position.getText();
        String priceCalculator = ProcessData.getCurrentPriceInCalculator();
        result=priceCalculator.contains(priceReceivedEmail);
        return result;
    }
}
