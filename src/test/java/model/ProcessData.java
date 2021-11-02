package model;

public class ProcessData {
    private static String currentPriceInCalculator;
    protected String currentBrowser;
    private String costStringDescription = "Total Estimated Cost";

    public String setCurrentPriceInCalculator(String currentPriceInCalculator) {
        this.currentPriceInCalculator = currentPriceInCalculator;
        return currentPriceInCalculator;
    }

    public static String getCurrentPriceInCalculator() {
        return currentPriceInCalculator;
    }
}
