package page;

import model.ProcessData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import waits.CustomWebElementWaits;

import java.time.Duration;
import java.util.Collection;
import java.util.List;

import static utils.LocatorUtils.positionElement;
import static waits.CustomWebElementWaits.*;

public class GoogleSearchResultPage extends AbstractPage {
    protected GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    private static long WAIT_TIMEOUT_SECONDS = 10;

    @FindBy(xpath = "//a[contains(text(), 'Google Cloud Platform Pricing')]")//a[b[contains(text(),'Calculator')]]
    private WebElement searchResult1;

    @FindBy(xpath = "//a[b[contains(text(),'Calculator')]]")
    private WebElement searchResult2;

    String str = "//a[contains(text(), 'Google Cloud Platform Pricing')]";

    @Override
    protected GoogleSearchResultPage openPage() {
        waitPageLoad(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator openCalculator() {
        String str1 = "//a[contains(text(), 'Google Cloud Platform Pricing')]";
        String str2 = "//a[b[contains(text(),'Calculator')]]";
        String str3 = "//a[contains(text(), 'Google Cloud Platform Pricing')]";

//        positionElement(str1, driver).click();
//        Boolean isPresent = driver.findElements(By.xpath(str1)).size() > 0;
//        String str3=driver.findElement(By.xpath(str1) ).getText();
//        System.out.println(str3);
        //  boolean find= (str3.equals(str1));
//?
        List<WebElement> linkSearch = driver.findElements(By.xpath(str1));

        int checkLink = linkSearch.size();
        if (checkLink != 0) {
            searchResult1.click();
//            WebElement position = (WebElement) driver.findElements(By.xpath(str1));
//            System.out.println(position);
//            position.click();
        } else {
            positionElement(str2, driver).click();
        }
return new CreateHomeGooglePageCalculator(driver);
    }


}
