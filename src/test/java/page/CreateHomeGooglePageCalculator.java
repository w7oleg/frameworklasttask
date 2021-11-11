package page;

import model.InstanceForm;
import model.ProcessData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TabsUtils;

import static utils.ComputeEngineUtils.active;
import static utils.LocatorUtils.positionElement;
import static utils.SaveResultUtils.saveResult;
import static waits.CustomWebElementWaits.waitElementToBeClickable;
import static waits.CustomWebElementWaits.waitPageLoad;

public class CreateHomeGooglePageCalculator extends AbstractPage {

    @FindBy(css = "#cloud-site > devsite-iframe > iframe")
    private WebElement iFrame;

    @FindBy(xpath = "//h2[@class='md-title']/b[contains(text(), 'USD')]")
    private WebElement result;

    @FindBy(id = "myFrame")
    private WebElement iFrameCalculatorAfterIFrame;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//md-tab-item/div[@title='Compute Engine' and @class='tab-holder compute']")
    private WebElement locatorComputerEngine;

    @FindBy(xpath = "//label[contains(text(),'Number of instances')]/following::input")
    private WebElement locatorNumberInstances;

    @FindBy(xpath = "//md-select-value[span[div[contains(text(),'Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)')]]]")
    private WebElement locatorOperationSystem;

    @FindBy(xpath = "//md-select-value[span[div[contains(text(),'Regular')]]]")
    private WebElement locatorMachineClass;

    @FindBy(xpath = "//md-select-value[span[div[contains(text(),'E2')]]]")
    private WebElement locatorSeries;

    @FindBy(xpath = "//md-select-value[span[div[contains(text(),'n1-standard-1 (vCPUs: 1, RAM: 3.75GB)')]]]")
    private WebElement locatorMachineType;

    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
    private WebElement locatorAddGPUs;

    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']")
    private WebElement locatorNumberGPUs;

    @FindBy(xpath = "//md-select[@placeholder='GPU type']")
    private WebElement locatorTypeGPUs;

    @FindBy(xpath = "//md-select[@placeholder='Local SSD']")
    private WebElement locatorLocalSSD;

    @FindBy(xpath = "//md-select[@placeholder='Datacenter location']/md-select-value")
    private WebElement locatorDataCenter;

    @FindBy(xpath = "//md-select-value[span[div[contains(text(),'None')]]]")
    private WebElement locatorCommittedUsage;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private WebElement locatorAddToEstimate;

    @FindBy(xpath = "//button[@aria-label= 'Email Estimate']")
    private WebElement locatorPressButtonEmailEstimate;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement locatorEnterEmail;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    private WebElement locatorButtonSendEmail;

    private String universalLocatorDown = "//div[contains(@class,'md-active md-clickable')]//md-option[@value='%s']";

    public CreateHomeGooglePageCalculator(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public CreateHomeGooglePageCalculator openPage() {
        waitPageLoad(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator activationComputeEngine() {
        active(driver, iFrame, iFrameCalculatorAfterIFrame);
        logger.info("Moved to PricingCalculatorPageFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator fillComputeEngineForm(InstanceForm instance) {
        WebElement position = waitElementToBeClickable(locatorNumberInstances, driver);
        position.click();
        position.sendKeys(instance.getChoiceNumberOfInstances());
        logger.info("Entered instances");

        waitElementToBeClickable(locatorOperationSystem, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceOperationSystem(), driver).click();
        logger.info("Entered Operation System" + instance.getChoiceOperationSystem());

        waitElementToBeClickable(locatorMachineClass, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceMachineClass(), driver).click();
        logger.info("Entered Machine Class" + instance.getChoiceMachineClass());


        waitElementToBeClickable(locatorSeries, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceSeries(), driver).click();
        logger.info("Entered Series" + instance.getChoiceSeries());


        waitElementToBeClickable(locatorMachineType, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceMachineType(), driver).click();
        logger.info("Entered MachineType" + instance.getChoiceMachineType());

        waitElementToBeClickable(locatorAddGPUs, driver).click();
        logger.info("Entered addGPUs");

        waitElementToBeClickable(locatorNumberGPUs, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceNumberGPUs(), driver).click();
        logger.info("Entered Number GPUs" + instance.getChoiceNumberGPUs());

        waitElementToBeClickable(locatorTypeGPUs, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceTypeGPU(), driver).click();
        logger.info("Entered Type GPU" + instance.getChoiceMachineType());

        waitElementToBeClickable(locatorLocalSSD, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceLocalSSD(), driver).click();
        logger.info("Entered Local SSD" + instance.getChoiceLocalSSD());

        waitElementToBeClickable(locatorDataCenter, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceDatacenterLocation(), driver).click();
        logger.info("Entered Datacenter Location" + instance.getChoiceDatacenterLocation());

        waitElementToBeClickable(locatorCommittedUsage, driver).click();
        positionElement(universalLocatorDown, instance.getChoiceCommittedUsage(), driver).click();
        logger.info("Entered Committed Usage" + instance.getChoiceCommittedUsage());

        return this;
    }

    public CreateHomeGooglePageCalculator pressAddToEstimate() {
        waitElementToBeClickable(locatorAddToEstimate, driver).click();
        logger.info("Entered Add To Estimate");
        return this;
    }

    public CreateHomeGooglePageCalculator saveResultEstimate() {
        saveResult(result);
        logger.info("Entered save Result Estimate");
        return this;
    }

    public CreateHomeGooglePageCalculator pressButtonEmailEstimate() {
        waitElementToBeClickable(locatorPressButtonEmailEstimate, driver).click();
        logger.info("Entered press Button EmailEstimate");
        return this;
    }

    public EmailEstimatePage openNewTab() {
        TabsUtils.openNewTab(1, driver);
        logger.info("open New Tab");
        return new EmailEstimatePage(driver/*, data*/);
    }

    public CreateHomeGooglePageCalculator enterEmail() {
        WebElement position = waitElementToBeClickable(locatorEnterEmail, driver);
        position.sendKeys(ProcessData.getCurrentEmailAddress());
        logger.info("enter Email");
        return this;
    }

    public CreateHomeGooglePageCalculator pressButtonSendEmail() {
        waitElementToBeClickable(locatorButtonSendEmail, driver).click();
        logger.info("press Button Send Email");
        return this;
    }

    public EmailEstimatePage returnToPageEmail() {
        TabsUtils.openNewTab(1, driver);
        logger.info("return to Page Email");
        return new EmailEstimatePage(driver/*, data*/);
    }
}
