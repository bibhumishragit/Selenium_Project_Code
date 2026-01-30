package Stepdefinition;

import PageObjects.Homepage;
import Utilities.Common_Method;
import Utilities.Read_Configuration;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Amazon_Login {
Homepage homepage=new Homepage();
Common_Method cmnmtd=new Common_Method();
SoftAssert sa=new SoftAssert();

    @When("User is in Amazon Home page verify Account login displays")
    public void verify_Amazonhome() throws InterruptedException{
        cmnmtd.navigatebaseurl();
        cmnmtd.explicitwait(homepage.all);
        cmnmtd.itemlocator(homepage.all).click();
        Thread.sleep(2000);
        cmnmtd.explicitwait(homepage.giftcard);
        cmnmtd.itemlocator(homepage.giftcard).click();
        cmnmtd.explicitwait(homepage.signin);
        cmnmtd.itemlocator(homepage.signin).click();
        Thread.sleep(2000);
    }
    @Then("User tries to login with valid credentials")
    public void navigateto_login(){
        cmnmtd.explicitwait(homepage.signininput);
        cmnmtd.itemlocator(homepage.signininput).sendKeys(Read_Configuration.getProperty("username"));
        cmnmtd.explicitwait(homepage.continuebtn);
        cmnmtd.itemlocator(homepage.continuebtn).click();
        cmnmtd.explicitwait(homepage.passwordinput);
        cmnmtd.itemlocator(homepage.passwordinput).sendKeys(Read_Configuration.getProperty("pwd"));
        cmnmtd.explicitwait(homepage.continuebtn);
        cmnmtd.itemlocator(homepage.continuebtn).click();
    }
    @Then("User logs out")
    public void user_logsout(){
        cmnmtd.explicitwait(homepage.expandaccount);
        cmnmtd.itemlocator(homepage.expandaccount).click();
        cmnmtd.explicitwait(homepage.signout);
        cmnmtd.itemlocator(homepage.signout).click();
    }
    @And("User scrolls browser window")
    public void scroll_window() throws InterruptedException {
        cmnmtd.explicitwait(homepage.contsearchfor);
        cmnmtd.scrollwindow(cmnmtd.itemlocator(homepage.contsearchfor));
    }
    @Then("User selects from dropdown to search item {string}")
    public void searchfrom_dropdown(String filteroption) throws InterruptedException {
        WebElement alldropdown=cmnmtd.itemlocator(homepage.alldropdown);
        cmnmtd.explicitwait(homepage.alldropdown);
        cmnmtd.itemlocator(homepage.alldropdown).click();
        cmnmtd.selectdropdown(alldropdown,filteroption);
        cmnmtd.itemlocator(homepage.searchinput).sendKeys("Iphone 17 PRO");
        Thread.sleep(500);
        cmnmtd.explicitwait(homepage.submitsearch);
        cmnmtd.itemlocator(homepage.submitsearch).click();
        sa.assertTrue(cmnmtd.itemlocator(homepage.searchresult).isDisplayed());
    }
    @Then("User selects all the options matching from table")
    public void dropdown_options(DataTable filteroptiondropdown) throws InterruptedException {
        List<List<String>>searchfilter=filteroptiondropdown.asLists();
        for(List<String>filters:searchfilter){
            String filtertext=filters.get(0);
            cmnmtd.explicitwait(homepage.alldropdown);
            WebElement alldropdown=cmnmtd.itemlocator(homepage.alldropdown);
            if(!alldropdown.isDisplayed()) {
                alldropdown.click();
            }
            cmnmtd.selectdropdown(alldropdown,filtertext);
        }
    }
    @When("User clicks home logo to return to Home page")
    public void return_to_Home() throws InterruptedException {
        cmnmtd.explicitwait(homepage.clickhomelogo);
        cmnmtd.itemlocator(homepage.clickhomelogo).click();
        Thread.sleep(500);
        cmnmtd.itemlocator(homepage.returnandorders).click();
        sa.assertTrue(cmnmtd.itemlocator(homepage.recentorder).isDisplayed());
        cmnmtd.itemlocator(homepage.vieworder).click();
        Thread.sleep(2000);
        cmnmtd.itemlocator(homepage.trackpackage).click();
        cmnmtd.explicitwait(homepage.deliveredstatus);
        String deliveryrec=cmnmtd.itemlocator(homepage.deliveredstatus).getDomAttribute("data-percent-complete");
        assert deliveryrec != null;
        if(Integer.parseInt(deliveryrec)<100){
            System.out.println("Item isn't delivered yet");
        }
        else{
            System.out.println("Product is delivered");
        }
    }
}
