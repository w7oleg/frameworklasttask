package test;

import model.InstanceForm;
import model.ProcessData;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleCloudHomePage;
import service.InstanceCreator;

public class GoogleCloudTest extends CommonConditions {


    @Test(description = "Smoke")

    public void checkEmailEstimateCost() {
        new InstanceCreator();
        InstanceForm instanceForm = InstanceCreator.getDataEstimateForm();
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
                .choiceCommittedUsage("1"/*instanceForm.getChoiceCommittedUsage()*/)
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
        Assert.assertEquals(verificationCalculationResultsReceivedEmail, ProcessData.getCurrentPriceInCalculator()
                , "the data received by mail does not coincide with the data received in the calculator");
    }
}
