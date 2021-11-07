package model;

public class InstanceForm {



    private String choiceNumberOfInstances;
    private String choiceOperationSystem;
    private String choiceMachineClass;
    private String choiceSeries;
    private String choiceMachineType;
    private String choiceNumberGPUs;
    private String choiceTypeGPU;
    private String choiceLocalSSD;
    private String choiceDatacenterLocation;



    private String choiceCommittedUsage;

    public InstanceForm(String choiceNumberOfInstances, String choiceOperationSystem, String choiceMachineClass, String choiceSeries, String choiceMachineType,
                        String choiceNumberGPUs, String choiceTypeGPU, String choiceLocalSSD, String choiceDatacenterLocation, String choiceCommittedUsage) {
        this.choiceNumberOfInstances= choiceNumberOfInstances;
        this.choiceOperationSystem = choiceOperationSystem;
        this.choiceMachineClass = choiceMachineClass;
        this.choiceSeries = choiceSeries;
        this.choiceMachineType = choiceMachineType;
        this.choiceNumberGPUs = choiceNumberGPUs;
        this.choiceTypeGPU = choiceTypeGPU;
        this.choiceLocalSSD = choiceLocalSSD;
        this.choiceDatacenterLocation = choiceDatacenterLocation;
        this.choiceCommittedUsage=choiceCommittedUsage;
    }
//    public InstanceForm(String choiceOperationSystem, String testData1, String testData2, String testData3, String testData4,
//                        String testData5, String testData6, String testData7) {
//    }


//    public static void setChoiceNumberOfInstances(String choiceNumberOfInstances) {
//        InstanceForm.choiceNumberOfInstances = choiceNumberOfInstances;
//    }
public String getChoiceNumberOfInstances() {
    return choiceNumberOfInstances;
}

    public String getChoiceOperationSystem() {
        return choiceOperationSystem;
    }

    public void setChoiceOperationSystem(String choiceOperationSystem) {
        this.choiceOperationSystem = choiceOperationSystem;
    }

    public String getChoiceMachineClass() {
        return choiceMachineClass;
    }

    public void setChoiceMachineClass(String choiceMachineClass) {
        this.choiceMachineClass = choiceMachineClass;
    }

    public String getChoiceSeries() {
        return choiceSeries;
    }

    public void setChoiceSeries(String choiceSeries) {
        this.choiceSeries = choiceSeries;
    }

    public String getChoiceMachineType() {
        return choiceMachineType;
    }

    public void setChoiceMachineType(String choiceMachineType) {
        this.choiceMachineType = choiceMachineType;
    }

    public String getChoiceNumberGPUs() {
        return choiceNumberGPUs;
    }

    public void setChoiceNumberGPUs(String choiceNumberGPUs) {
        this.choiceNumberGPUs = choiceNumberGPUs;
    }

    public String getChoiceTypeGPU() {
        return choiceTypeGPU;
    }

    public void setChoiceTypeGPU(String choiceTypeGPU) {
        this.choiceTypeGPU = choiceTypeGPU;
    }

    public String getChoiceLocalSSD() {
        return choiceLocalSSD;
    }

    public void setChoiceLocalSSD(String choiceLocalSSD) {
        this.choiceLocalSSD = choiceLocalSSD;
    }

    public String getChoiceDatacenterLocation() {
        return choiceDatacenterLocation;
    }

    public void setChoiceDatacenterLocation(String choiceDatacenterLocation) {
        this.choiceDatacenterLocation = choiceDatacenterLocation;
    }

    public String getChoiceCommittedUsage() {
        return choiceCommittedUsage;
    }


//    public void setChoiceCommittedUsage(String choiceCommittedUsage) {
//    }
}


