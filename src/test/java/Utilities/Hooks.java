package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        DeviceManager.getDriver(Read_Configuration.getProperty("Browser"));
    }

    @After
    public void teardown(){
        DeviceManager.quitdriver();
    }
}
