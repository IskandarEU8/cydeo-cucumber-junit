package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Hooks {

    /*
    //import from io.cucumber.java not from junit
    @Before(order = 0)
    public void switchToEnglish() {
//        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
//        googleSearchPage.switchGoogleToEnglish.click();

    }

     */

    /*

    @Before(value = "@login", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("\n");
        System.err.println("\n======this will only apply to scenarious with @login tag");

    }

    @After
    public void teardownScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }



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

     */
}
