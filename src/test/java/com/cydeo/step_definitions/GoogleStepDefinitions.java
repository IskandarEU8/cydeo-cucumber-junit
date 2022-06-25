package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {


    @When("user types {string} and click enter")
    public void user_types_and_click_enter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types apple and click enter")
    public void user_types_apple_and_click_enter() {
        // Write code here that turns the phrase above into concrete actions
        googleSearchPage.searchBox.sendKeys("apple", Keys.ENTER);
    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        // Write code here that turns the phrase above into concrete actions
            String expectedTitle = "apple - Google Search";
//            String expectedTitle = "apple - Google'da Ara";
            String actualTitle = Driver.getDriver().getTitle();

            Assert.assertTrue(actualTitle.equals(expectedTitle));
        System.out.println("true");
    }


    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals("Title is not as expected",expectedTitle, actualTitle);

        Driver.quitDriver(1.3);
    }



    @Then("User switches Google to English version")
    public void userSwitchesGoogleToEnglishVersion() {
        googleSearchPage.switchGoogleToEnglish.click();
    }
}

//1.43.15