package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public static void verifyTitle( String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle, "Title verification FAILED");

    }

    public static void switchGoogleToEnglish() {
        WebElement english = Driver.getDriver().findElement(By.xpath("//a[.='English']"));
        english.click();
    }
}
