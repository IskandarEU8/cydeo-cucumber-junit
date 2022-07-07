package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

     /*
        we make WebDriver private, because we want to close access from outside the class.
        We make it static because we will use it in a static method.
         */

//    private static WebDriver driver;

    /**
     * We need InheritableThreadLocal class because now we have to use different webdrivers for parallel testing
     */
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();



    /*
    Create a re-usable utility method which will return same driver instance when we call it
     */
    public static WebDriver getDriver() {
        if (driverPool.get() == null) {

                /*
                     We read our browserType from configurationType from configuration.properties
                     This way , can control which browser is opened from outside our code, from configuration.properties.
                 */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browserType that will be return from configuration.properties file
            switch statement will determine the case, and open the matching browser
             */
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set( new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set( new FirefoxDriver() );
//                    driver = new FirefoxDriver();
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driverPool.set( new SafariDriver() );
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }
        return driverPool.get();
    }

    public static void quitDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this will terminate the existing session. Value will not even be null
            driverPool.remove();

        }
    }


    public static void quitDriver(int wait) {
        BrowserUtils.sleep(wait);
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this will terminate the existing session. Value will not even be null
            driverPool.remove();
        }
    }
/*
    public static void quitDriver(double wait) {
        try {
            Thread.sleep((long) wait * 1000);
               if (driver != null) {
            driver.quit(); // this will terminate the existing session. Value will not even be null
            driver = null;
        } catch (Exception e) {

        }
 */

        public static void quitDriver ( double wait) {
            BrowserUtils.sleep(wait);
            if (driverPool.get() != null) {
                driverPool.get().quit(); // this will terminate the existing session. Value will not even be null
                driverPool.remove();
            }
        }

    /*
    This method will make sure our drive value is always null after using quit()method
     */

        }

