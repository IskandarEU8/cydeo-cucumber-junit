package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @When("user types apple and click enter")
    public void user_types_apple_and_click_enter() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        // Write code here that turns the phrase above into concrete actions

    }


    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.quitDriver(1.3);
    }

}

//1.43.15