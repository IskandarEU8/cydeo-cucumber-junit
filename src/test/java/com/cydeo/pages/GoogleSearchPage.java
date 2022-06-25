package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {


    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (name = "q")
    public WebElement searchBox;


    @FindBy (linkText = "English")
    public WebElement switchGoogleToEnglish;

}
