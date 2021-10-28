package test;

import model.InstanceForm;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.GoogleCloudHomePage;
import service.InstanceCreator;

public class GoogleCloudTest extends CommonConditions {

    @Test(description = "get a letter with the results of processing the request")

    public void checkEmailEstimate() {
        InstanceForm instanceForm = new InstanceCreator().getDataEstimateForm();


        String verificationCalculationResultsReceivedEmail = new GoogleCloudHomePage(driver/*, data*/)
                .openPage()
                .fillSearchInput(instanceForm.getLocatorPositionSearchInput(), instanceForm.getTextElementSearchInput()
                        , instanceForm.getInputTextForString())
                .openCalculator(instanceForm.getLocatorPositionCalculatorLink(), instanceForm.getTextElementCalculatorLink())
                .activationComputeEngine(instanceForm.getLocatorPositionComputerEngine()
                        , instanceForm.getTextElementComputerEngine())
                .choiceNumberOfInstances(instanceForm.getLocatorPositionNumberInstances()
                        , instanceForm.getTextElementNumberInstances())
                .choiceOperationSystem(instanceForm.getLocatorPositionElement()
                        , instanceForm.getTextElementChoiceOperationSystem()
                        , instanceForm.getChoiceOperationSystem(), instanceForm.getLocatorPositionPositionDownList())
                .choiceMachineClass(instanceForm.getLocatorPositionElement(), instanceForm.getTextElementMachineClass()
                        , instanceForm.getChoiceMachineClass(), instanceForm.getLocatorPositionPositionDownList())
                .choiceSeries(instanceForm.getLocatorPositionElement(), instanceForm.getTextElementSeries()
                        , instanceForm.getChoiceSeries()
                        , instanceForm.getLocatorPositionPositionDownList())
                .choiceMachineType(instanceForm.getLocatorPositionElement(), instanceForm.getTextElementMachineType()
                        , instanceForm.getChoiceMachineType(), instanceForm.getLocatorPositionPositionDownList())
                .addGPUs(instanceForm.getLocatorPositionElementGPUS(), instanceForm.getTextElementAddGPU())
                .choiceNumberGPUs(instanceForm.getLocatorPositionSpecificElementGPUS(), instanceForm.getTextElementNumberOfGPUS()
                        , instanceForm.getChoiceNumberGPUs(), instanceForm.getLocatorPositionPositionDownList())
                .choiceTypeGPU(instanceForm.getLocatorPositionSpecificElementGPUS(), instanceForm.getTextElementTextGpuType()
                        , instanceForm.getChoiceTypeGPU(), instanceForm.getLocatorPositionPositionDownList())
                .choiceLocalSSD(instanceForm.getLocatorPositionElementLocalSSD(), instanceForm.getTextElementLocalSSD()
                        , instanceForm.getChoiceLocalSSD(), instanceForm.getLocatorPositionPositionDownList())
                .choiceDatacenterLocation(instanceForm.getLocatorPositionDatacenter(), instanceForm.getTextElementDatacenter()
                        , instanceForm.getChoiceDatacenterLocation(), instanceForm.getLocatorPositionPositionDownList())
                .choiceCommittedUsage(instanceForm.getLocatorPositionElement(), instanceForm.getTextElementCommittedUsage()
                        , instanceForm.getChoiceCommittedUsage(), instanceForm.getLocatorPositionPositionDownList())
                .pressAddToEstimate(instanceForm.getLocatorPositionAddEstimate(), instanceForm.getTextElementAddEstimate())
                .saveResultEstimate()
                .pressButtonEmailEstimate(instanceForm.getLocatorPositionButtonEmail(), instanceForm.getTextElementButtonEmail())
                .openNewTab()
                .openPage()
                .copyEmailAddress(instanceForm.getLocatorLinkCopyRandomAddress(), instanceForm.getTextElementCopyRandomAddress())
                .comeBackToCalculator()
                .enterEmail(instanceForm.getLocatorInputEmail(), instanceForm.getTextElementInputEmail())
                .pressButtonSendEmail(instanceForm.getLocatorButtonSendEmail(), instanceForm.getTextElementButtonSendEmail())
                .returnToPageEmail()
                .pressCheckMailButton(instanceForm.getLocatorLinkCheckEmail(), instanceForm.getTextElementLincChekEmail())
                .thisComparisonResultsReceivedEmailWithDataSite(/*instanceForm.getLocatorLetterField()
                        , instanceForm.getTextElementLetterField()*/);
        Assert.assertTrue(data.getCurrentPriceInCalculator().contains(verificationCalculationResultsReceivedEmail)/*verificationCalculationResultsReceivedEmail*/, "the data received by mail does not" +
                " coincide with the data received in the calculator");
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
