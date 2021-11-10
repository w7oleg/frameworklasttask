package model;


public class ProcessData {
    private static String currentPriceInCalculator;
    private static String currentEmailAddress;



    private static String str1 = "//a[contains(text(), 'Google Cloud Platform Pricing')]";
    public static String getStr1() {
        return str1;
    }
    public static String getCurrentEmailAddress() {
        return currentEmailAddress;
    }

    public static void setCurrentEmailAddress(String currentEmailAddress) {
        ProcessData.currentEmailAddress = currentEmailAddress;
    }


    private String costStringDescription = "Total Estimated Cost";



    public String setCurrentPriceInCalculator(String currentPriceInCalculator) {
        this.currentPriceInCalculator = currentPriceInCalculator;
        return currentPriceInCalculator;
    }

    public static String getCurrentPriceInCalculator() {
        return currentPriceInCalculator;
    }




}
