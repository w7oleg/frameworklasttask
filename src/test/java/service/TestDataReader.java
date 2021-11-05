package service;

import java.util.ResourceBundle;

public class TestDataReader {
    private static final ResourceBundle commonResources = ResourceBundle.getBundle(System.getProperty("environment"));

    public static String getTestData(String key) {
        return commonResources.getString(key);
    }
}
