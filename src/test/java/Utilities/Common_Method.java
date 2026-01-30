package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Common_Method {

    WebDriver driver;
    public Common_Method(){
        this.driver=DeviceManager.getdriver();
    }

    public void explicitwait(By itemlocator){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.presenceOfElementLocated((By) itemlocator));
    }

    public void navigatebaseurl(){
        driver.navigate().to(Read_Configuration.getProperty("baseURL"));
    }

    public void scrollwindow(WebElement element) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
    }

    public void selectdropdown(WebElement dropdownselect,String filteroption) throws InterruptedException {
        Select drop=new Select(dropdownselect);
        List<WebElement>alloptions=drop.getOptions();
        for(WebElement option:alloptions){
            String optiontext=option.getText();
            if(optiontext.equals(filteroption)){
                drop.selectByVisibleText(filteroption);
                Thread.sleep(2000);
            }
        }
    }
    public WebElement itemlocator(By itemlocator){
        return driver.findElement(itemlocator);
    }
}
