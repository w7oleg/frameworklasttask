package model;

public class InstanceForm {

    private static String choiceNumberOfInstances;
    private String choiceOperationSystem;
    private String choiceMachineClass;
    private String choiceSeries;
    private String choiceMachineType;
    private String choiceNumberGPUs;
    private String choiceTypeGPU;
    private String choiceLocalSSD;
    private String choiceDatacenterLocation;
    private String choiceCommittedUsage;

    public static String getChoiceNumberOfInstances() {
        return choiceNumberOfInstances;
    }

    public static void setChoiceNumberOfInstances(String choiceNumberOfInstances) {
        InstanceForm.choiceNumberOfInstances = choiceNumberOfInstances;
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

    public void setChoiceCommittedUsage(String choiceCommittedUsage) {
        this.choiceCommittedUsage = choiceCommittedUsage;
    }
}


