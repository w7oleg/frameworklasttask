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
  //  private static final String COMMITTED_USAGE = "testdata.instanceForm.committed-sage";

    public static InstanceForm getDataEstimateForm() {
//        new InstanceForm();
//        InstanceForm meaningEstimateForm = new InstanceForm();
      //     meaningEstimateForm.setChoiceCommittedUsage(TestDataReader.getTestData(COMMITTED_USAGE));
      return new InstanceForm(
              /* meaningEstimateForm.setChoiceDatacenterLocation(*//*)*/
              TestDataReader.getTestData(OPERATION_SYSTEM),
              TestDataReader.getTestData(MACHINE_CLASS),
              TestDataReader.getTestData(SERIES_ID),
              TestDataReader.getTestData(MACHINE_TYPE),
              TestDataReader.getTestData(NUMBER_OF_GPUS),
              TestDataReader.getTestData(TYPE_GPU),
              TestDataReader.getTestData(LOCAL_SSD),
              TestDataReader.getTestData(DATA_CENTER_LOCATION));
              // meaningEstimateForm.setChoiceNumberOfInstances(TestDataReader.getTestData(NUMBER_OF_INSTANCES));
      }
    }
