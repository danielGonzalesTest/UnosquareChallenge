package us.challenge.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessorApi {
    private static final String BASE_API = "url_api";

    private static PropertyAccessorApi PropertyAccessorApi;
    private Properties properties;

    private PropertyAccessorApi(){
        try(FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException fe){
            throw new RuntimeException(fe);
        }
    }

    public static PropertyAccessorApi getInstance(){
        if(PropertyAccessorApi == null){
            PropertyAccessorApi = new PropertyAccessorApi();
        }
        return PropertyAccessorApi;
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            return properties.getProperty(nameProperty);
        }
        return property;
    }

    public String getBaseApi() { return getDataProperty(BASE_API); }
}
