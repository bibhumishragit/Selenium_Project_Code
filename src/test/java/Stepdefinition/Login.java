package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Login {
    public static String username;
    public static String password;

    public static List<String> Username(DataTable table){
        List<String>usernamelist=new ArrayList<>();
        List<Map<String, String>> credentials = table.asMaps(String.class, String.class);
        for (Map<String, String> credential : credentials) {
            username = credential.get("Username");
            //System.out.println("Entered username::" + username);
            //password = credential.get("Password");
            //System.out.println("Entered password::" + password);
            usernamelist.add(username);
        }
        return usernamelist;
    }
    public static List<String> password(DataTable table){
        List<String>passwordlist=new ArrayList<>();
        List<Map<String, String>> credentials = table.asMaps(String.class, String.class);
        for (Map<String, String> credential : credentials) {
            password = credential.get("Password");
            //System.out.println("Entered password::" + password);
            passwordlist.add(password);
        }
        return passwordlist;
    }

    @Then("User enters username and password from a table")
    public void user_enters_correct_username(DataTable table) {
        /*List<Map<String, String>> credentials = table.asMaps(String.class, String.class);
        for (Map<String, String> credential : credentials) {
            username = credential.get("Username");
            password = credential.get("Password");
            System.out.println("Entered username::" + username);
            System.out.println("Entered password::" + password);
        }*/
        System.out.println("Username Data:::"+Username(table));
        System.out.println("Password Data:::"+password(table));
    }

    @Then ("User clicks on submit and verifies home page {string} displayed")
    public void  user_clicks_on_submit (String test) {
        System.out.println("The data passed from feature file::"+test);
    }

    @Then("user clicks on home icons {string} {string} {string}")
    public void clickicons(String set1, String set2, String set3) {
        System.out.println("Icon1 Name::"+set1);
        System.out.println("Icon2 Name::"+set2);
        System.out.println("Icon3 Name::"+set3);
    }

    @Then("User clicks something")
    public void user_clicks_something(DataTable datable) {
        List<List<String>>datallist=datable.asLists();
        List<String>dlist1=datallist.get(0);
        dlist1.forEach(System.out::println);
        List<String>dlist2=datallist.get(1);
        dlist2.forEach(System.out::println);
    }

    @Then("User clicks to use vertical DT")
    public void verticalmultirow(DataTable tab){
        List<Map<String,String>>listdata=tab.asMaps(String.class,String.class);
        listdata.forEach(verticallist->{
            String hostdata=verticallist.get("host");
            String portdata=verticallist.get("port");
            String dbdata=verticallist.get("db_name");
            System.out.println("Host::"+hostdata+"Port Details::"+portdata+"DB Details::"+dbdata);
        });
    }
    @Then("User clicks datattable")
    public void useofdatatable(DataTable t2){
        List<List<String>> listofdata=t2.asLists();
        for(List<String>datalist:listofdata){
            String dataset1=datalist.get(0);
            String dataset2=datalist.get(1);
            System.out.println("Data set1 wdout header::"+dataset1);
            System.out.println("Data set2 wdout header::"+dataset2);
        }
    }

    @Then("User gets Username and Password separately")
    public void getcredentialreparate(DataTable credential){
        List<List<String>>userdetaillist=credential.asLists();
        List<String> username=new ArrayList<>();
        List<String> password=new ArrayList<>();
        for(int i=1;i<userdetaillist.size();i++) {
            List<String> userdetaillist1=userdetaillist.get(i);
            username.add(userdetaillist1.get(0));
            password.add(userdetaillist1.get(1));
        }
        System.out.println("userdetail list1::"+userdetaillist);
        System.out.println("Username::"+username);
        System.out.println("Passeord::"+password);
    }
}