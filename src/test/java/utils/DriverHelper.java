package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class DriverHelper {

    private static WebDriver driver;
    //private constructor
    private DriverHelper(){}
    /*the reason why we did is private
    because we need to prevent others to create object out of
    this class. This is another great example of Encapsulation
     */
    public static WebDriver getDriver(){
        if (driver==null || ((RemoteWebDriver)driver).getSessionId() == null){
            switch (ConfigReader.readProperty("browser")){
                case "chrome":
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    driver=new EdgeDriver();
                    break;
                default:
                    driver=new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

}
