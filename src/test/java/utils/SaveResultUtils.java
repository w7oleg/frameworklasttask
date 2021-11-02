package utils;

import model.ProcessData;
import org.openqa.selenium.WebElement;

public class SaveResultUtils {
    public static String saveResult(WebElement result){
        ProcessData data=new ProcessData();
        String resultText= result.getText();
        String target1= String.copyValueOf("Total Estimated Cost: ".toCharArray());
        String target2= String.copyValueOf(" per 1 month".toCharArray());
        resultText=resultText.replace(target1, "");
        resultText=resultText.replace(target2, "");
        System.out.println(resultText);
        return data.setCurrentPriceInCalculator(resultText);
    }
}
