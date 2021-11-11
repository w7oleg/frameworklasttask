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
        this.choiceNumberOfInstances = choiceNumberOfInstances;
        this.choiceOperationSystem = choiceOperationSystem;
        this.choiceMachineClass = choiceMachineClass;
        this.choiceSeries = choiceSeries;
        this.choiceMachineType = choiceMachineType;
        this.choiceNumberGPUs = choiceNumberGPUs;
        this.choiceTypeGPU = choiceTypeGPU;
        this.choiceLocalSSD = choiceLocalSSD;
        this.choiceDatacenterLocation = choiceDatacenterLocation;
        this.choiceCommittedUsage = choiceCommittedUsage;
    }

    public String getChoiceNumberOfInstances() {
        return choiceNumberOfInstances;
    }

    public String getChoiceOperationSystem() {
        return choiceOperationSystem;
    }

    public String getChoiceMachineClass() {
        return choiceMachineClass;
    }

    public String getChoiceSeries() {
        return choiceSeries;
    }

    public String getChoiceMachineType() {
        return choiceMachineType;
    }

    public String getChoiceNumberGPUs() {
        return choiceNumberGPUs;
    }

    public String getChoiceTypeGPU() {
        return choiceTypeGPU;
    }

    public String getChoiceLocalSSD() {
        return choiceLocalSSD;
    }

    public String getChoiceDatacenterLocation() {
        return choiceDatacenterLocation;
    }

    public String getChoiceCommittedUsage() {
        return choiceCommittedUsage;
    }
}


