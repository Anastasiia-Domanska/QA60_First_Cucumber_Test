package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {
    @Given("user lunches Chrome browser")
    public void lunches_Chrome_browser(){
        new HomePage(driver).lunchBrowser();
    }
    @When("user opens ilcarro HomePage")
    public void opens_ilcarro_HomePag(){
        new HomePage(driver).openURL();
    }
    @Then("user verifies HomePage title")
    public void verify_HomePage_title(){
        new HomePage(driver).isHomePageTitleDisplayed();
    }
    @And("user quits browser")
    public void quit_browser(){
        new HomePage(driver).tearDown();
    }
}
