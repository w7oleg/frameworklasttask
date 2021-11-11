package test;

import model.InstanceForm;
import model.ProcessData;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleCloudHomePage;
import service.InstanceCreator;

public class GoogleCloudTest extends CommonConditions {

    @Test(description = "get a letter with the results of processing the request")

    public void checkEmailEstimateCost() {
        new InstanceCreator();
        InstanceForm instanceForm = InstanceCreator.getDataEstimateForm();
        String verificationCalculationResultsReceivedEmail = new GoogleCloudHomePage(driver)
                .openPage()
                .fillSearchInput()
                .openCalculator()
                .activationComputeEngine()
                .fillComputeEngineForm(instanceForm)
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
