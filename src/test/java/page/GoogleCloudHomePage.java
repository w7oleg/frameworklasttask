package page;

import model.InstanceForm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static waits.CustomWebElementWaits.waitBeforeChoosingMenuOptionAfterClick;

public class GoogleCloudHomePage extends AbstractPage{

    private static final String HOME_PAGE_URL = "https://cloud.google.com/";
    private final Logger logger = LogManager.getRootLogger();

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

    public GoogleSearchResultPage fillSearchInput() {
        WebElement position = waitBeforeChoosingMenuOptionAfterClick(elementInputText, driver);
        position.click();
        position.sendKeys(InstanceForm.getInputTextForString());
        position.sendKeys(Keys.ENTER);
        logger.info("searching" + InstanceForm.getInputTextForString());
        return new GoogleSearchResultPage(driver/*, data*/);
    }
}
