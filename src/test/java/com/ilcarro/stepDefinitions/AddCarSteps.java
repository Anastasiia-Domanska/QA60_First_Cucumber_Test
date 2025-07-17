package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("user opens Add Car page")
    public void openAddCarPage() {
        new HomePage(driver).goToAddCarPage();
    }

    @And("user fills out car form")
    public void fillOutCarForm() {
        new AddCarPage(driver).fillCarForm();
    }

    @And("user submits the car form")
    public void submitCarForm() {
        new AddCarPage(driver).submitForm();
    }

    @Then("car should be added successfully")
    public void car_should_be_added_successfully(){
        new LoginPage(driver).isMessageTextPresent("Car added successfully");
    }
}
