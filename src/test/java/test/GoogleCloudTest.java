package test;

import model.InstanceForm;
import model.ProcessData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.GoogleCloudHomePage;
import service.InstanceCreator;

public class GoogleCloudTest extends CommonConditions {

    InstanceForm instanceForm = new InstanceCreator().getDataEstimateForm();
    @Test(description = "get a letter with the results of processing the request")

    public void checkEmailEstimateCost() {
        String verificationCalculationResultsReceivedEmail = new GoogleCloudHomePage(driver)
                .openPage()
                .fillSearchInput()
                .openCalculator()
                .activationComputeEngine()
                .choiceNumberOfInstances()
                .choiceOperationSystem(instanceForm.getChoiceOperationSystem())
                .choiceMachineClass(instanceForm.getChoiceMachineClass())
                .choiceSeries(instanceForm.getChoiceSeries())
                .choiceMachineType(instanceForm.getChoiceMachineType())
                .addGPUs()
                .choiceNumberGPUs(instanceForm.getChoiceNumberGPUs())
                .choiceTypeGPU(instanceForm.getChoiceTypeGPU())
                .choiceLocalSSD(instanceForm.getChoiceLocalSSD())
                .choiceDatacenterLocation(instanceForm.getChoiceDatacenterLocation())
                .choiceCommittedUsage(instanceForm.getChoiceCommittedUsage())
                .pressAddToEstimate()
                .saveResultEstimate()
                .pressButtonEmailEstimate()
                .openNewTab()
                .openPage()
                .copyEmailAddress()
                .comeBackToCalculator()
                .enterEmail()
                .pressButtonSendEmail()
                .returnToPageEmail()
                .pressCheckMailButton()
                .thisComparisonResultsReceivedEmailWithDataSite();
        Assert.assertTrue(ProcessData.getCurrentPriceInCalculator().equalsIgnoreCase(verificationCalculationResultsReceivedEmail)
                , "the data received by mail does not coincide with the data received in the calculator");
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
