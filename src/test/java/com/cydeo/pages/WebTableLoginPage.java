package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;


    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    /**
     * No parameters
     * When we call this method, it will direclty login using
     *
     * Username: Test
     * Password: Tester
     */

    public void login(){
        username.sendKeys("Test");
        password.sendKeys("Tester");
        loginButton.click();

    }
    /**
     * This method will accept two arguments and login.
     * @param username
     * @param password
     */
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();

    }

    public void loginWithConfig(){
        username.sendKeys(ConfigurationReader.getProperty("web.table.login"));
        password.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        loginButton.click();

    }

}
