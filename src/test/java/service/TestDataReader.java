package service;

import java.util.ResourceBundle;

public class TestDataReader {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("src/test/resources/"));//environment

    public static String getTestData(String key) {
        return resourceBundle.getString(key);
    }
}
