package service;

import model.InstanceForm;

public class InstanceCreator {
    private static final String LOCATOR_SEARCH_INPUT = "testdata.instanceForm.locator-search-input";
    private static final String LOCATOR_GOOGLE_CALCULATOR_LINK = "testdata.instanceForm.locator-calculator-link";
    private static final String LOCATOR_COMPUTER_ENGINE = "testdata.instanceForm.locator-computer-engine";
    private static final String LOCATOR_NUMBER_INSTANCES = "testdata.instanceForm.locator-number-instances";
    private static final String LOCATOR_ADD_ESTIMATE = "testdata.instanceForm.locator-add-estimate";
    private static final String LOCATOR_POSITION_ELEMENT = "testdata.instanceForm.locator-position-element";
    private static final String LOCATOR_POSITION_ELEMENT_GPUS = "testdata.instanceForm.locator-element-gpus";
    private static final String LOCATOR_POSITION_SPECIFIC_ELEMENT_GPUS = "testdata.instanceForm.locator-specific-element-gpus";
    private static final String LOCATOR_POSITION_ELEMENT_LOCAL_SSD = "testdata.instanceForm.locator-local-ssd";
    private static final String LOCATOR_POSITION_DATACENTER = "testdata.instanceForm.locator-datacenter";
    private static final String LOCATOR_POSITION_BUTTON_EMAIL = "testdata.instanceForm.locator-button-email";
    private static final String LOCATOR_POSITION_INPUT_EMAIL = "testdata.instanceForm.locator-input-email";
    private static final String LOCATOR_POSITION_BUTTON_SEND_EMAIL = "testdata.instanceForm.locator-button-send-email";
    private static final String LOCATOR_POSITION_LINK_COPY_RANDOM_ADRESS = "testdata.instanceForm.locator-link-copy-random-address";
    private static final String LOCATOR_POSITION_LINK_CHECK_EMAIL = "testdata.instanceForm.locator-link-chek-email";
    private static final String LOCATOR_POSITION_LETTER_FIELD = "testdata.instanceForm.locator-letter-field";
    private static final String LOCATOR_POSITION_SAVE_RESULT="testdata.instanceForm.locator-save-result";

    private static final String LOCATOR_POSITION_DOWN_LIST="testdata.instanceForm.locator-position-down-list";


    private static final String SEARCH_QUERY = "testdata.instanceForm.search-query";
    private static final String NUMBER_OF_INSTANCES = "testdata.instanceForm.number";
    private static final String OPERATION_SYSTEM = "testdata.instanceForm.os";
    private static final String MACHINE_CLASS = "testdata.instanceForm.machine-class";
    private static final String SERIES_ID = "testdata.instanceForm.series-id";
    private static final String MACHINE_TYPE = "testdata.instanceForm.machine-type";
    private static final String NUMBER_OF_GPUS = "testdata.instanceForm.number-of-gpus";
    private static final String TYPE_GPU = "testdata.instanceForm.type-gpu";
    private static final String LOCAL_SSD = "testdata.instanceForm.local-ssd";
    private static final String DATA_CENTER_LOCATION = "testdata.instanceForm.datacenter";
    private static final String COMMITTED_USAGE = "testdata.instanceForm.committed-sage";

    //  private static final String RESULT_CALCULATOR= "testdata.instanceForm.result-calculator";

    private static final String INPUT_TEXT = "testdata.instanceForm.text-input";
    private static final String TEXT_SEARCH_INPUT = "testdata.instanceForm.text-search-input";
    private static final String TEXT_OPERATION_SYSTEM = "testdata.instanceForm.text-operation-system";
    private static final String TEXT_MACHINE_CLASS = "testdata.instanceForm.text-machine-class";
    private static final String TEXT_ELEMENT_SERIES = "testdata.instanceForm.text-element-series";
    private static final String TEXT_MACHINE_TYPE = "testdata.instanceForm.text-machine-type";
    private static final String TEXT_LOCAL_SSD = "testdata.instanceForm.text-local-ssd";
    private static final String TEXT_COMMITTED_USAGE = "testdata.instanceForm.text-committed-usage";
    private static final String TEXT_ADD_GPU = "testdata.instanceForm.text-add-gpu";
    private static final String TEXT_NUMBER_OF_GPU = "testdata.instanceForm.text-number-of-gpus";
    private static final String TEXT_GPU_TYPE = "testdata.instanceForm.text-gpu-type";
    private static final String TEXT_DATACENTER = "testdata.instanceForm.text-datacenter";
    // private static final String TEXT_SEARCH_INPUT = " testdata.instanceForm.text-search-input";
    private static final String TEXT_CALCULATOR_LINK = "testdata.instanceForm.text-calculator-link";
    private static final String TEXT_COMPUTER_ENGINE = "testdata.instanceForm.text-computer-engine";
    private static final String TEXT_NUMBER_INSTANCES = "testdata.instanceForm.text-number-instances";
    private static final String TEXT_ADD_ESTIMATE = "testdata.instanceForm.text-add-estimate";
    private static final String TEXT_BUTTON_EMAIL = "testdata.instanceForm.text-button-email";
    private static final String TEXT_INPUT_EMAIL = "testdata.instanceForm.text-input-email";
    private static final String TEXT_BUTTON_SEND_EMAIL = "testdata.instanceForm.text-button-send-email";
    private static final String TEXT_LINK_COPY_RANDOM_ADDRESS = "testdata.instanceForm.text-link-copy-random-address";
    private static final String TEXT_LINK_CHEK_EMAIL = "testdata.instanceForm.text-link-chek-email";
    private static final String TEXT_LETTER_FIELD = "testdata.instanceForm.text-letter-field";
    private static final String TEXT_SAVE_RESULT="testdata.instanceForm.text-save-result";
    private static final String TEXT_COPY_RANDOM_ADDRESS="testdata.instanceForm.text-copy-random-address";

    public static InstanceForm getDataEstimateForm() {
        InstanceForm meaningEstimateForm = new InstanceForm();

        meaningEstimateForm.setChoiceCommittedUsage(TestDataReader.getTestData(COMMITTED_USAGE));
        meaningEstimateForm.setChoiceDatacenterLocation(TestDataReader.getTestData(DATA_CENTER_LOCATION));
        meaningEstimateForm.setChoiceLocalSSD(TestDataReader.getTestData(LOCAL_SSD));
        meaningEstimateForm.setChoiceMachineClass(TestDataReader.getTestData(MACHINE_CLASS));
        meaningEstimateForm.setChoiceMachineType(TestDataReader.getTestData(MACHINE_TYPE));
        meaningEstimateForm.setChoiceNumberGPUs(TestDataReader.getTestData(NUMBER_OF_GPUS));
        meaningEstimateForm.setChoiceNumberOfInstances(TestDataReader.getTestData(NUMBER_OF_INSTANCES));
        meaningEstimateForm.setChoiceOperationSystem(TestDataReader.getTestData(OPERATION_SYSTEM));
        meaningEstimateForm.setChoiceNumberGPUs(TestDataReader.getTestData(NUMBER_OF_GPUS));
        meaningEstimateForm.setChoiceTypeGPU(TestDataReader.getTestData(TYPE_GPU));
        meaningEstimateForm.setChoiceSeries(TestDataReader.getTestData(SERIES_ID));

        meaningEstimateForm.setLocatorButtonSendEmail(TestDataReader.getTestData(LOCATOR_POSITION_BUTTON_SEND_EMAIL));
      //  meaningEstimateForm.setLocatorInputEmail(TestDataReader.getTestData(LOCATOR_POSITION_INPUT_EMAIL));
        meaningEstimateForm.setLocatorLetterField(TestDataReader.getTestData(LOCATOR_POSITION_LETTER_FIELD));
        meaningEstimateForm.setLocatorPositionAddEstimate(TestDataReader.getTestData(LOCATOR_ADD_ESTIMATE));
        meaningEstimateForm.setLocatorPositionSearchInput(TestDataReader.getTestData(LOCATOR_SEARCH_INPUT));
        meaningEstimateForm.setLocatorPositionCalculatorLink(TestDataReader.getTestData(LOCATOR_GOOGLE_CALCULATOR_LINK));
        meaningEstimateForm.setLocatorPositionComputerEngine(TestDataReader.getTestData(LOCATOR_COMPUTER_ENGINE));
        meaningEstimateForm.setLocatorPositionElement(TestDataReader.getTestData(LOCATOR_POSITION_ELEMENT));
        meaningEstimateForm.setLocatorPositionElementGPUS(TestDataReader.getTestData(LOCATOR_POSITION_ELEMENT_GPUS));
        meaningEstimateForm.setLocatorPositionSpecificElementGPUS(TestDataReader.getTestData(LOCATOR_POSITION_SPECIFIC_ELEMENT_GPUS));
        meaningEstimateForm.setLocatorPositionElementLocalSSD(TestDataReader.getTestData(LOCATOR_POSITION_ELEMENT_LOCAL_SSD));
        meaningEstimateForm.setLocatorPositionDatacenter(TestDataReader.getTestData(LOCATOR_POSITION_DATACENTER));
        meaningEstimateForm.setLocatorPositionNumberInstances(TestDataReader.getTestData(LOCATOR_NUMBER_INSTANCES));
        meaningEstimateForm.setLocatorPositionAddEstimate(TestDataReader.getTestData(LOCATOR_ADD_ESTIMATE));
        meaningEstimateForm.setLocatorPositionButtonEmail(TestDataReader.getTestData(LOCATOR_POSITION_BUTTON_EMAIL));
        meaningEstimateForm.setLocatorInputEmail(TestDataReader.getTestData(LOCATOR_POSITION_INPUT_EMAIL));
        meaningEstimateForm.setLocatorLinkCopyRandomAddress(TestDataReader.getTestData(LOCATOR_POSITION_LINK_COPY_RANDOM_ADRESS));
        meaningEstimateForm.setLocatorLinkCheckEmail(TestDataReader.getTestData(LOCATOR_POSITION_LINK_CHECK_EMAIL));
        meaningEstimateForm.setLocatorLetterField(TestDataReader.getTestData(LOCATOR_POSITION_LETTER_FIELD));
        meaningEstimateForm.setLocatorPositionSaveResult(TestDataReader.getTestData(LOCATOR_POSITION_SAVE_RESULT));

        meaningEstimateForm.setLocatorPositionPositionDownList(TestDataReader.getTestData(LOCATOR_POSITION_DOWN_LIST));

        meaningEstimateForm.setSearchInput(TestDataReader.getTestData(TEXT_SEARCH_INPUT));
        meaningEstimateForm.setTextElementAddEstimate(TestDataReader.getTestData(TEXT_ADD_ESTIMATE));
        meaningEstimateForm.setTextElementSearchInput(TestDataReader.getTestData(TEXT_SEARCH_INPUT));
        meaningEstimateForm.setTextElementCalculatorLink(TestDataReader.getTestData(TEXT_CALCULATOR_LINK));
        meaningEstimateForm.setTextElementComputerEngine(TestDataReader.getTestData(TEXT_COMPUTER_ENGINE));
        meaningEstimateForm.setTextElementChoiceOperationSystem(TestDataReader.getTestData(TEXT_OPERATION_SYSTEM));
        meaningEstimateForm.setTextElementMachineClass(TestDataReader.getTestData(TEXT_MACHINE_CLASS));
        meaningEstimateForm.setTextElementSeries(TestDataReader.getTestData(TEXT_ELEMENT_SERIES));
        meaningEstimateForm.setTextElementMachineType(TestDataReader.getTestData(TEXT_MACHINE_TYPE));
        meaningEstimateForm.setTextElementLocalSSD(TestDataReader.getTestData(TEXT_LOCAL_SSD));
        meaningEstimateForm.setTextElementCommittedUsage(TestDataReader.getTestData(TEXT_COMMITTED_USAGE));
        meaningEstimateForm.setTextElementAddGPU(TestDataReader.getTestData(TEXT_ADD_GPU));
        meaningEstimateForm.setTextElementNumberOfGPUS(TestDataReader.getTestData(TEXT_NUMBER_OF_GPU));
        meaningEstimateForm.setTextElementTypeGPU(TestDataReader.getTestData(TYPE_GPU));
        meaningEstimateForm.setTextElementDatacenter(TestDataReader.getTestData(TEXT_DATACENTER));
        meaningEstimateForm.setTextElementNumberInstances(TestDataReader.getTestData(TEXT_NUMBER_INSTANCES));
        meaningEstimateForm.setTextElementButtonEmail(TestDataReader.getTestData(TEXT_BUTTON_EMAIL));
        meaningEstimateForm.setTextElementInputEmail(TestDataReader.getTestData(TEXT_INPUT_EMAIL));
        meaningEstimateForm.setTextElementButtonSendEmail(TestDataReader.getTestData(TEXT_BUTTON_SEND_EMAIL));
        meaningEstimateForm.setTextElementLincCopyRandomAddress(TestDataReader.getTestData(TEXT_LINK_COPY_RANDOM_ADDRESS));
        meaningEstimateForm.setTextElementLincChekEmail(TestDataReader.getTestData(TEXT_LINK_CHEK_EMAIL));
        meaningEstimateForm.setTextElementLetterField(TestDataReader.getTestData(TEXT_LETTER_FIELD));
        meaningEstimateForm.setTextElementSaveResult(TestDataReader.getTestData(TEXT_SAVE_RESULT));
        meaningEstimateForm.setTextElementCopyRandomAddress(TestDataReader.getTestData(TEXT_COPY_RANDOM_ADDRESS));
        meaningEstimateForm.setTextElementTextGpuType(TestDataReader.getTestData(TEXT_GPU_TYPE));

        meaningEstimateForm.setInputTextForString(TestDataReader.getTestData(INPUT_TEXT));

        return meaningEstimateForm;
    }


}