package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {
    public WikiSearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(name = "search")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;


    @FindBy (xpath = "//h1[@id='firstHeading']")
    public WebElement mainHeader;


    @FindBy (xpath = "//table[@class='infobox biography vcard']//div[@class='fn']")
    public WebElement photoMainHeader;
}
