package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static waits.CustomWebElementWaits.waitElementToBeClickable;

public class GoogleCloudHomePage extends AbstractPage {

    private static final String HOME_PAGE_URL = "https://cloud.google.com/";

    @FindBy(xpath = "//div[@class='devsite-searchbox']/input")
    private WebElement elementInputText;

    public GoogleCloudHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public GoogleCloudHomePage openPage() {
        driver.navigate().to(HOME_PAGE_URL);
        logger.info("page opened");
        return this;
    }

    String text = "Google Cloud Platform Pricing Calculator";

    public GoogleSearchResultPage fillSearchInput() {
        WebElement position = waitElementToBeClickable(elementInputText, driver);
        position.click();
        position.sendKeys(text);
        position.sendKeys(Keys.ENTER);
        logger.info("searching" + text);
        return new GoogleSearchResultPage(driver);
    }
}
