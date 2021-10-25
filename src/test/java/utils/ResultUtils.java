package utils;

import model.ProcessData;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultUtils {
    public static void saveResult(ProcessData data, List<WebElement> result){
        for (WebElement price : result) {
            if (price.getText().contains(data.getCostStringDescription())) {
                data.setCurrentPriceInCalculator(price.getText());
            }
        }
    }
}
