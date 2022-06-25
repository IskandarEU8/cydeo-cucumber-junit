package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 0)
    public void setupScenario() {
        System.out.println("\n");
        System.out.println("======Setting up browser using cucumber @Before");

    }

    @Before(value = "@login", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("\n");
        System.err.println("\n======this will only apply to scenarious with @login tag");

    }

    @After
    public void teardownScenario() {

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
