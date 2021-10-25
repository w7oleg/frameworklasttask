package resources;

public class GooglePageResources {
    private final String choiceNumberOfInstances = "4";
    private final String choiceOperationSystem = "free"; //"Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS";
    private final String choiceMachineClass = "regular";
    private final String choiceSeries = "n1";
    private final String choiceMachineType = "CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8";
    private final String choiceNumberGPUs = "1";
    private final String choiceTypeGPU = "NVIDIA_TESLA_V100";
    private final String choiceLocalSSD = "2";
    private final String choiceDatacenterLocation = "europe-west3";
    private final String choiceCommittedUsage = "1";
    private final String costStringDescription = "Total Estimated Cost";
    private String resultPriceCalculator = "";

    private final String searchInput = "Google Cloud Platform Pricing Calculator";

    private final String textElementChoiceOperationSystem = "Free: Debian, CentOS, CoreOS, Ubuntu or BYOL (Bring Your Own License)";
    private final String textElementMachineClass = "Regular";
    private final String textElementSeries = "E2";
    private final String textElementMachineType = "n1-standard-1 (vCPUs: 1, RAM: 3.75GB)";
    private final String textElementLocalSSD = "Local SSD";
    private final String textElementCommittedUsage = "None";
    private final String textElementAddGPU = "Add GPUs";
    private final String textElementNumberOfGPUS = "Number of GPUs";
    private final String textElementTypeGPU = "GPU type";
    private final String textElementDatacenter ="Datacenter location";

    private final static String locatorPositionElement= "//md-select-value[span[div[contains(text(),'%s')]]]";
    private final static String locatorPositionElementGPUS = "//md-checkbox[@aria-label='%s']";//h2[contains(text(),'Instances')]/..
    private final static String locatorPositionSpecificElementGPUS = "//md-select[@placeholder='%s']";//h2[contains(text(),'Instances')]/..//md-select[@placeholder='%s']
    private final static String locatorPositionElementLocalSSD = "//md-select[@placeholder='%s']";
    private final static String locatorPositionDatacenter = "//md-select[@placeholder='%s']/md-select-value";

    private final static String locatorPositionDownList = "//div[contains(@class,'md-active md-clickable')]//md-option[@value='%s']";

    public String getSearchInput() {
        return searchInput;
    }
    public static String getLocatorPositionDownList() {
        return locatorPositionDownList;
    }
    public static String getLocatorPositionDatacenter() {
        return locatorPositionDatacenter;
    }
    public static String getLocatorPositionElementLocalSSD() {
        return locatorPositionElementLocalSSD;
    }
    public static String getLocatorPositionSpecificElementGPUS() {return locatorPositionSpecificElementGPUS;}
    public static String getLocatorPositionElementGPUS() {
        return locatorPositionElementGPUS;
    }
    public static String getLocatorPositionElement() {
        return locatorPositionElement;
    }
    public String getTextElementDatacenter() {
        return textElementDatacenter;
    }
    public String getTextElementTypeGPU() {
        return textElementTypeGPU;
    }

    public String getTextElementNumberOfGPUS() {
        return textElementNumberOfGPUS;
    }

    public String getTextElementAddGPU() {
        return textElementAddGPU;
    }

    public String getTextElementCommittedUsage() {
        return textElementCommittedUsage;
    }

    public String getTextElementLocalSSD() {
        return textElementLocalSSD;
    }

    public String getTextElementMachineType() {
        return textElementMachineType;
    }

    public String getTextElementSeries() {
        return textElementSeries;
    }

    public String getTextElementMachineClass() {
        return textElementMachineClass;
    }

    public String getTextElementChoiceOperationSystem() {
        return textElementChoiceOperationSystem;
    }

    public String getChoiceNumberOfInstances(){
        return choiceNumberOfInstances;
    }

    public String getChoiceOperationSystem(){
        return choiceOperationSystem;
    }

    public String getChoiceMachineClass(){
        return choiceMachineClass;
    }

    public String getChoiceSeries(){
        return choiceSeries;
    }

    public String getChoiceMachineType(){
        return choiceMachineType;
    }

    public String getChoiceNumberGPUs(){
        return choiceNumberGPUs;
    }

    public String getChoiceTypeGPU(){
        return choiceTypeGPU;
    }

    public String getChoiceLocalSSD(){
        return choiceLocalSSD;
    }

    public String getChoiceDatacenterLocation(){
        return choiceDatacenterLocation;
    }

    public String getChoiceCommittedUsage(){
        return choiceCommittedUsage;
    }

    public String getCostStringDescription(){
        return costStringDescription;
    }

    public String getResultPriceCalculator(){
        return resultPriceCalculator;
    }

    public void setResultPriceCalculator(String resultPriceCalculator){
        this.resultPriceCalculator = resultPriceCalculator;
    }
}
