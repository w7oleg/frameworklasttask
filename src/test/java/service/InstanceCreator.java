package service;

import model.InstanceForm;

public class InstanceCreator {
    private static final String NUMBER_OF_INSTANCES = "testdata.instanceCreator.number";
    private static final String OPERATION_SYSTEM = "testdata.instanceCreator.os";
    private static final String MACHINE_CLASS = "testdata.instanceCreator.machine-class";
    private static final String SERIES_ID = "testdata.instanceCreator.series-id";
    private static final String MACHINE_TYPE = "testdata.instanceCreator.machine-type";
    private static final String NUMBER_OF_GPUS = "testdata.instanceCreator.number-of-gpus";
    private static final String TYPE_GPU = "testdata.instanceCreator.type-gpu";
    private static final String LOCAL_SSD = "testdata.instanceCreator.local-ssd";
    private static final String DATA_CENTER_LOCATION = "testdata.instanceCreator.datacenter";
    private static final String COMMITTED_USAGE = "testdata.instanceCreator.committed-sage";

    public static InstanceForm getDataEstimateForm() {
      return new InstanceForm(
              TestDataReader.getTestData(NUMBER_OF_INSTANCES),
              TestDataReader.getTestData(OPERATION_SYSTEM),
              TestDataReader.getTestData(MACHINE_CLASS),
              TestDataReader.getTestData(SERIES_ID),
              TestDataReader.getTestData(MACHINE_TYPE),
              TestDataReader.getTestData(NUMBER_OF_GPUS),
              TestDataReader.getTestData(TYPE_GPU),
              TestDataReader.getTestData(LOCAL_SSD),
              TestDataReader.getTestData(DATA_CENTER_LOCATION),
              TestDataReader.getTestData(COMMITTED_USAGE));
      }
    }
