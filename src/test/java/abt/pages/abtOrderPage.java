package abt.pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;

import java.time.Duration;
import java.util.List;

public class abtOrderPage {
    public abtOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div[class='category_item_container']")
    List<WebElement> listOfProduct;
    @FindBy(css= "h1[id='product_title']")
    WebElement title;
    @FindBy(xpath = "//div[@id='product_top_add_container']//button[@class='addToCart green_button']")
    WebElement addToCard;
    @FindBy(css = "#global_estimation_zipcode")
    WebElement zipcode;
    @FindBy(css = "button[id='lightbox_zip_submit']")
    WebElement zipcodeBtn;
    @FindBy(css = "#news-popover-no-thanks")
    WebElement closeBtn;
    @FindBy(xpath = "//span[.='Price Match Guarantee']")
    WebElement scroll;

    public void chooseItem(WebDriver driver,String title){
         closeBtn.click();
        for (int i = 0; i <listOfProduct.size(); i++) {
            listOfProduct.get(i).click();
        }
        Assert.assertEquals(title,this.title.getText());
    }
    public void addToCard(WebDriver driver,String zipcode) throws InterruptedException {
        BrowserUtils.scrollIntoViewWithJS(driver,this.scroll);
        Thread.sleep(2000);
        addToCard.click();
        this.zipcode.sendKeys(zipcode);
        zipcodeBtn.click();

    }



}
