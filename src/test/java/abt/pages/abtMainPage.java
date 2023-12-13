package abt.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class abtMainPage {

    public abtMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "#search-input")
    WebElement searchBar;
    public void sendKeyToSearchBar(String product) {
        this.searchBar.sendKeys(product,Keys.ENTER);

    }


}
