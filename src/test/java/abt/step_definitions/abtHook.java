package abt.step_definitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class abtHook {
    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("abtURL"));

    }


}
