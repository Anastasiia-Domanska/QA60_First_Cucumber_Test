package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class SearchSteps {

    SearchPage searchPage = new SearchPage(driver);

    @And("User is on the search page")
    public void userIsOnSearchPage() {
        driver.get("https://ilcarro.web.app/search");
    }

    @And("User enters location {string} and dates")
    public void userEntersLocationAndDates(String city) {
        searchPage.enterSearchData(city, "08/20/2025", "08/30/2025");
    }

    @And("User clicks on Yalla button")
    public void userClicksOnYallaButton() {
        searchPage.clickSearchButton();
    }

    @Then("Car search results should be displayed")
    public void searchResultsShouldBeDisplayed() {
        searchPage.verifySearchResultsVisible();
    }
}
