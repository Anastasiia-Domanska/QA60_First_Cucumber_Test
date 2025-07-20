package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityInput;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement okLocation;

    @FindBy(xpath = "//input[@id='dates']")
    WebElement datesInput;

    @FindBy(xpath = "//button[contains(text(),'Y’alla!')]")
    WebElement yallaButton;

    @FindBy(css = ".search-results")
    WebElement resultsBlock;

//    public SearchPage enterSearchData(String city, String startDate, String endDate) {
//        type(cityInput, city);
//        click(okLocation);
//        datesInput.clear();
//        type(datesInput, startDate + " - " + endDate);
//        return this;
//    }

    public SearchPage enterSearchData(String city, String startDate, String endDate) {
        type(cityInput, city);
        click(okLocation);

        datesInput.click();
        datesInput.clear();
        type(datesInput, startDate + " - " + endDate);

        datesInput.sendKeys(Keys.TAB);

        wait.until(ExpectedConditions.elementToBeClickable(yallaButton));

        return this;
    }


    public SearchPage clickSearchButton() {
        click(yallaButton);
        return this;
    }

    public SearchPage verifySearchResultsVisible() {
        assert resultsBlock.isDisplayed();
        return this;
    }
}
