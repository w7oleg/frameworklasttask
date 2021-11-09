package model;

public class ProcessData {
    private static String currentPriceInCalculator;
    private static String emailAddress;
    private String costStringDescription = "Total Estimated Cost";

    public String setCurrentPriceInCalculator(String currentPriceInCalculator) {
        this.currentPriceInCalculator = currentPriceInCalculator;
        return currentPriceInCalculator;
    }

    public static String getCurrentPriceInCalculator() {
        return currentPriceInCalculator;
    }

    public static String getEmailAddress() {
        return emailAddress;
    }

    public static void setEmailAddress(String emailAddress) {
        ProcessData.emailAddress = emailAddress;
    }
}
