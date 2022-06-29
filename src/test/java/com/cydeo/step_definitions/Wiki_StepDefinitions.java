package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("User is on Wikipedia home page2")
    public void user_is_on_wikipedia_home_page2() {
        Driver.getDriver().get("https://wikipedia.org");
    }
    @When("User types {string} in the wiki search box2")
    public void user_types_in_the_wiki_search_box2(String string) {
        wikiSearchPage.searchBox.sendKeys(string);

    }
    @When("User clicks wiki search button2")
    public void user_clicks_wiki_search_button2() {
        wikiSearchPage.searchButton.click();
    }
    @Then("User sees {string} is in the wiki title2")
    public void user_sees_is_in_the_wiki_title2(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @Then("User sees {string} is in the main headerg")
    public void userSeesIsInTheMainHeaderg(String string) {



        Assert.assertTrue(wikiSearchPage.photoMainHeader.getText().equals(string));
    }
}
