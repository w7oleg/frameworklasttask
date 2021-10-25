package model;

public class ProcessData {
    private static String currentPriceInCalculator;
    private String costStringDescription= "Total Estimated Cost";

    public static String getCurrentPriceInCalculator() {
        return currentPriceInCalculator;
    }

    public void setCurrentPriceInCalculator(String currentPriceInCalculator) {
        this.currentPriceInCalculator = currentPriceInCalculator;
    }

    public String getCostStringDescription(){
        return costStringDescription;
    }

}
