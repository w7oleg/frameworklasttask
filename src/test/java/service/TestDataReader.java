package service;

import org.testng.annotations.Parameters;

import java.util.ResourceBundle;
@Parameters("environment")
public class TestDataReader {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));

    public static String getTestData(String key) {
        return resourceBundle.getString(key);
    }
}
