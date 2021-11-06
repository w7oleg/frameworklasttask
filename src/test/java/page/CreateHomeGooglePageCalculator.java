package page;

import org.openqa.selenium.Keys;
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

    public CreateHomeGooglePageCalculator choiceNumberOfInstances() {
        WebElement position = waitElementToBeClickable(locatorNumberInstances, driver);
        position.click();
        position.sendKeys("4"/*InstanceForm.getChoiceNumberOfInstances()*/);
        logger.info("Entered instances");
        return this;
    }

    public CreateHomeGooglePageCalculator choiceOperationSystem(String operationSystem) {
        waitElementToBeClickable(locatorOperationSystem, driver).click();
        positionElement(universalLocatorDown, operationSystem, driver).click();
        logger.info("Entered Operation System" + operationSystem);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceMachineClass(String machineClass) {
        waitElementToBeClickable(locatorMachineClass, driver).click();
        positionElement(universalLocatorDown, machineClass, driver).click();
        logger.info("Entered Machine Class" + machineClass);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceSeries(String series) {
        waitElementToBeClickable(locatorSeries, driver).click();
        positionElement(universalLocatorDown, series, driver).click();
        logger.info("Entered Series" + series);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceMachineType(String type) {
        waitElementToBeClickable(locatorMachineType, driver).click();
        positionElement(universalLocatorDown, type, driver).click();
        logger.info("Entered MachineType" + type);
        return this;
    }

    public CreateHomeGooglePageCalculator addGPUs() {
        waitElementToBeClickable(locatorAddGPUs, driver).click();
        logger.info("Entered addGPUs");
        return this;
    }

    public CreateHomeGooglePageCalculator choiceNumberGPUs(String number) {
        waitElementToBeClickable(locatorNumberGPUs, driver).click();
        positionElement(universalLocatorDown, number, driver).click();
        logger.info("Entered Number GPUs" + number);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceTypeGPU(String type) {
        waitElementToBeClickable(locatorTypeGPUs, driver).click();
        positionElement(universalLocatorDown, type, driver).click();
        logger.info("Entered Type GPU" + type);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceLocalSSD(String local) {
        waitElementToBeClickable(locatorLocalSSD, driver).click();
        positionElement(universalLocatorDown, local, driver).click();
        logger.info("Entered Local SSD" + local);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceDatacenterLocation(String center) {
        waitElementToBeClickable(locatorDataCenter, driver).click();
        positionElement(universalLocatorDown, center, driver).click();
        logger.info("Entered Datacenter Location" + center);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceCommittedUsage(String period) {
        waitElementToBeClickable(locatorCommittedUsage, driver).click();
        positionElement(universalLocatorDown, period, driver).click();
        logger.info("Entered Committed Usage" + period);
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
        return new EmailEstimatePage(driver);
    }

    public CreateHomeGooglePageCalculator enterEmail() {
        WebElement position = waitElementToBeClickable(locatorEnterEmail, driver);
        position.sendKeys(Keys.LEFT_CONTROL, "v");
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
