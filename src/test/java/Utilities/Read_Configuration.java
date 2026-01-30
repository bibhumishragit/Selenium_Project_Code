package Utilities;

import java.io.*;
import java.util.*;

public class Read_Configuration {
    private static String  filepath="D://Eclipse-Workspace//Selenium_Project_Code//src//test//resources//ConfigRead.properties";
    private static Properties properties;

    static{
        try{
            properties=new Properties();
            FileInputStream fis=new FileInputStream(filepath);
            properties.load(fis);
        }
        catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to load config file");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
