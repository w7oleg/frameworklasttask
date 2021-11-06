package service;

import model.InstanceForm;

public class InstanceCreator {
  //  private static final String NUMBER_OF_INSTANCES = "testdata.instanceForm.number";
    private static final String OPERATION_SYSTEM = "testdata.instanceForm.os";
    private static final String MACHINE_CLASS = "testdata.instanceForm.machine-class";
    private static final String SERIES_ID = "testdata.instanceForm.series-id";
    private static final String MACHINE_TYPE = "testdata.instanceForm.machine-type";
    private static final String NUMBER_OF_GPUS = "testdata.instanceForm.number-of-gpus";
    private static final String TYPE_GPU = "testdata.instanceForm.type-gpu";
    private static final String LOCAL_SSD = "testdata.instanceForm.local-ssd";
    private static final String DATA_CENTER_LOCATION = "testdata.instanceForm.datacenter";
    private static final String COMMITTED_USAGE = "testdata.instanceForm.committed-sage";

    public static InstanceForm getDataEstimateForm() {
        new InstanceForm();
        InstanceForm meaningEstimateForm = new InstanceForm();
        meaningEstimateForm.setChoiceCommittedUsage(TestDataReader.getTestData(COMMITTED_USAGE));
        meaningEstimateForm.setChoiceDatacenterLocation(TestDataReader.getTestData(DATA_CENTER_LOCATION));
        meaningEstimateForm.setChoiceLocalSSD(TestDataReader.getTestData(LOCAL_SSD));
        meaningEstimateForm.setChoiceMachineClass(TestDataReader.getTestData(MACHINE_CLASS));
        meaningEstimateForm.setChoiceMachineType(TestDataReader.getTestData(MACHINE_TYPE));
        meaningEstimateForm.setChoiceNumberGPUs(TestDataReader.getTestData(NUMBER_OF_GPUS));
       // meaningEstimateForm.setChoiceNumberOfInstances(TestDataReader.getTestData(NUMBER_OF_INSTANCES));
        meaningEstimateForm.setChoiceOperationSystem(TestDataReader.getTestData(OPERATION_SYSTEM));
        meaningEstimateForm.setChoiceNumberGPUs(TestDataReader.getTestData(NUMBER_OF_GPUS));
        meaningEstimateForm.setChoiceTypeGPU(TestDataReader.getTestData(TYPE_GPU));
        meaningEstimateForm.setChoiceSeries(TestDataReader.getTestData(SERIES_ID));
        return meaningEstimateForm;
    }
}