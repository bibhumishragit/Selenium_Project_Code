package Utilities;

import io.cucumber.java.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class DeviceManager {
    private static WebDriver driver;
    private DeviceManager(){}

    public static WebDriver getDriver(String browser){
        if(driver==null) {
            if(browser.equals("ch")){
                driver=new ChromeDriver();
            } else if (browser.equals("ff")) {
                driver=new FirefoxDriver();
            } else if (browser.equals("ee")) {
                driver=new EdgeDriver();
            }
            else{
                System.out.println("No Browser has been set up");
            }
            assert driver != null;
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static WebDriver getdriver() {
        if (driver == null) {
            throw new RuntimeException("Driver not initialized. Call getDriver(String browser) first.");
        }
        return driver;
    }

    public static void quitdriver() {
        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }
}
