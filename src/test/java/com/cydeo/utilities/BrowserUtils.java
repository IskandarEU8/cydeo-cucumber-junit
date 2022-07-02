package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
 /*
    This method will accept int (in seconds) and execute Thread.sleep for given duration
     */

    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {

        }
    }

    public static void sleep(double seconds) {
        seconds *= 1000;
        try {
            Thread.sleep((long) seconds);
        } catch (InterruptedException e) {

        }
    }


    /*
    This method accepts 3 arguments.
    Arg1: WebDriver
    Arg2: expectedInUrl: to verify if the URL contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindowsHandle : allWindowsHandles) {
            Driver.getDriver().switchTo().window(eachWindowsHandle);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            System.out.println("Current Title: " + Driver.getDriver().getTitle());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        //Assert: Title contains ***
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }



    /*
    This method accepts a String "expectedTitle" and Asserts if it is true;
     */

    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle, "Title verification FAILED");

    }

    /**
     * This method swtiches local Google search page to english version
     */
    public static void switchGoogleToEnglish() {
        WebElement english = Driver.getDriver().findElement(By.xpath("//a[.='English']"));
        english.click();
    }

    /**
     * This method verifies if the current URL contains expected value.
     *
     * @param expectedTextInURL
     */
    public static void verifyUrlContains(String expectedTextInURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedTextInURL));
    }

    /**
     * This method will accept a dropdown as a WebElement
     * and return all the 'options' text in a List of String
     *
     * @param dropdownElement
     * @return List<String> actualOptionsAsString
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {

        Select select = new Select(dropdownElement);

        //List of all ACTUAL month <options> as a web element
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //List of all ACTUAL month options as a string
        List<String> asctualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            asctualOptionsAsString.add(each.getText());
        }


        return asctualOptionsAsString;
    }
}