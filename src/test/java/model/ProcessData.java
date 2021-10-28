package model;

public class ProcessData {
    private static String currentPriceInCalculator;
    protected String currentBrowser;
    private String costStringDescription= "Total Estimated Cost";

    public void setCurrentBrowser(String currentBrowser) {
        this.currentBrowser = currentBrowser;
    }

    public void setCurrentPriceInCalculator(String currentPriceInCalculator) {
        this.currentPriceInCalculator = currentPriceInCalculator;
    }
    public static String getCurrentPriceInCalculator() {
        return currentPriceInCalculator;
    }
    public String getCurrentBrowser() {
        return currentBrowser;
    }

    public String getCostStringDescription(){
        return costStringDescription;
    }
}
