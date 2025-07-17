package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("user clicks on login link")
    public void click_on_login_link(){
        new HomePage(driver).clickOnLoginLink();
    }
    @And("user enters valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("ana21@gmail.com", "Aa12345!");
    }
    @And("user clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }
    @Then("user verifies success message is displayed")
    public void verify_success_message_is_displayed(){
        new LoginPage(driver).isMessageTextPresent("Logged in success");
    }
    @And("user enters valid email and wrong password")
    public void enter_valid_email_and_wrong_password(DataTable table){
        new LoginPage(driver).enterWrongData(table);
    }
    @Then("user verifies error message is displayed")
    public void verify_error_message_is_displayed(){
        new LoginPage(driver).isMessageTextPresent("Login or Password incorrect");
    }
}
