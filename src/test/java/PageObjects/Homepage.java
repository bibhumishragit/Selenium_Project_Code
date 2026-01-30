package PageObjects;

import Utilities.DeviceManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;
    public Homepage(){
        this.driver=DeviceManager.getdriver();
    }

    public By all=By.xpath("//span[@class='hm-icon-label']");
    public By giftcard=By.xpath("//div[normalize-space()='Gift Cards & Mobile Recharges']");
    public By signin=By.xpath("//b[normalize-space()='Hello, sign in']");
    public By signininput=By.xpath("//input[@id='ap_email_login']");
    public By continuebtn=By.xpath("//input[@type='submit']");
    public By passwordinput=By.xpath("//input[@id='ap_password']");
    public By expandaccount=By.xpath("//button[@aria-label='Expand Account and Lists']");
    public By signout=By.xpath("//span[normalize-space()='Sign Out']");
    public By contsearchfor=By.xpath("//span[contains(text(),\"Amazon Launchpad\")]");
    public By alldropdown=By.xpath("//select[contains(@class,'nav-search-dropdown')]");
    public By searchinput=By.xpath("//input[@id='twotabsearchtextbox']");
    public By submitsearch=By.xpath("//input[@id='nav-search-submit-button']");
    public By searchresult=By.xpath("//span[contains(text(),'30W Dual Port GaN Charger, USB & Type C Fast Charg')]");
    public By clickhomelogo=By.xpath("//a[@id='nav-logo-sprites']");
    public By returnandorders=By.id("nav-orders");
    public By recentorder=By.xpath("//a[@class='a-link-normal'][contains(text(),'Bombay Shaving')]");
    public By vieworder=By.xpath("(//a[@class='a-link-normal'][normalize-space()='View order details'])[1]");
    public By trackpackage=By.xpath("(//a[normalize-space()='Track package'])[1]");
    public By deliveredstatus=By.xpath("(//div[text()='Delivered']//parent::div)[1]");
}
