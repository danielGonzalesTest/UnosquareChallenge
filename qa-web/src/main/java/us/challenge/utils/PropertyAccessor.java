package us.challenge.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor {
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "base_url";

    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor(){
        try(FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException fe){
            throw new RuntimeException(fe);
        }
    }

    public static PropertyAccessor getInstance(){
        if(PropertyAccessor == null){
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            return properties.getProperty(nameProperty);
        }
        return property;
    }

    public int getMinTimeWait() {
        return Integer.parseInt(getDataProperty("MIN_WAIT"));
    }

    public int getMaxTimeWait() {
        return Integer.parseInt(getDataProperty("MAX_WAIT"));
    }

    public String getBrowser() {
        return getDataProperty(BROWSER);
    }

    public String getBaseUrl() { return getDataProperty(BASE_URL); }

}
