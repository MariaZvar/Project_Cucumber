package abt.step_definitions;

import abt.pages.abtMainPage;
import abt.pages.abtOrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.Map;

public class abtSteps {

    WebDriver driver= DriverHelper.getDriver();
    abtMainPage mainPage=new abtMainPage(driver);
    abtOrderPage orderPage=new abtOrderPage(driver);

    @Given("user navigates to etsy webpage and searches for product")
    public void user_navigates_to_etsy_webpage_and_searches_for_product(io.cucumber.datatable.DataTable dataTable) {
        Map<String ,String > itemName=dataTable.asMap();
        mainPage.sendKeyToSearchBar(itemName.get("product"));

    }
    @Then("user picks any order and validates product title of it")
    public void user_picks_any_order_and_validates_product_title_of_it(io.cucumber.datatable.DataTable dataTable) {
        Map<String ,String > priceValidation=dataTable.asMap();
        orderPage.chooseItem(driver, priceValidation.get("title"));




    }
    @Then("user clicks on add to card button and enters zipcode")
    public void user_clicks_on_add_to_card_button_and_enters_zipcode(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        Map<String ,String > zipcodeAndAdd=dataTable.asMap();
        orderPage.addToCard(driver,zipcodeAndAdd.get("zipcode"));


    }


}
