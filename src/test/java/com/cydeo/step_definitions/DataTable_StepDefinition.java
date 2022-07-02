package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinition {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        /*
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();

         */

        System.out.println(fruits);
        System.out.println(fruits.get(0));

    }


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().navigate().to("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
/*
        Select select = new Select(dropdownsPage.monthDropdown);
        List <WebElement>  actualOptionsAsWebElement = select.getOptions();

       List<String> actualOptionsAsString = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        System.out.println("expectedMonths = " + expectedMonths);
        System.out.println("actualOptionsAsString = " + actualOptionsAsString);
        // Assert will check the size of the list first. If it is matching it will check content 1 by 1
          Assert.assertEquals(expectedMonths, actualOptionsAsString);

 */

        //This method will return us the List of Spring of given dropdown's option
        List<String>  actualMonths =  BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);

        // Assert will check the size of the list first. If it is matching it will check content 1 by 1
        Assert.assertEquals(expectedMonths, actualMonths);
    }


}
//4.02.00