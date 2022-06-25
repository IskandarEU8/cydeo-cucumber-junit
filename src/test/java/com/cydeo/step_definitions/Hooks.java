package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 0)
    public void switchToEnglish() {
//        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
//        googleSearchPage.switchGoogleToEnglish.click();

    }

    @Before(value = "@login", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("\n");
        System.err.println("\n======this will only apply to scenarious with @login tag");

    }

    @After
    public void teardownScenario() {

//        Driver.quitDriver(1.5);

        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/Take screenshot if failed");

    }
    @BeforeStep
    public void beforeStep(){
        System.out.println("\n------------- applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("\n------------- applying teardown using @AfterStep");
    }
}
