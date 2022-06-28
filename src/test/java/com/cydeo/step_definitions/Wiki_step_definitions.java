package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Wiki_step_definitions {

    WikiSearchPage searchForSteveOnWiki = new WikiSearchPage();

    @Given("user is on Wikipedia page")
    public void user_is_on_wikipedia_page() {
        Driver.getDriver().get("https://wikipedia.org");
    }
    @And("users searches for {string}")
    public void users_searches_for_steve_jobs(String string) {
        // Write code here that turns the phrase above into concrete actions


        searchForSteveOnWiki.searchBox.sendKeys(string);
        searchForSteveOnWiki.searchButton.click();
    }


    @Then("user sees {string} in the title")
    public void userSeesSteveJobsInTheTitle(String string) {
        String expectedText = string;
        String actualText = Driver.getDriver().getTitle();
        Assert.assertTrue(actualText.contains(string));


        Assert.assertTrue(searchForSteveOnWiki.mainHeader.getText().equals(expectedText));
        Assert.assertTrue(searchForSteveOnWiki.photoMainHeader.getText().equals(expectedText));
    }
}
//25300