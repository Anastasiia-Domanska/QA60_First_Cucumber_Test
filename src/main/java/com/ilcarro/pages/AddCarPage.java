package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends BasePage {

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='pickUpPlace']")
    WebElement locationInput;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement okLocation;

    @FindBy(xpath = "//input[@id='make']")
    WebElement manufactureInput;

    @FindBy(xpath = "//input[@id='model']")
    WebElement modelInput;

    @FindBy(xpath = "//input[@id='year']")
    WebElement yearInput;

    @FindBy(xpath = "//select[@id='fuel']")
    WebElement fuelDropdown;

    @FindBy(xpath = "//option[@value='Diesel']")
    WebElement fuelOptionDiesel;

    @FindBy(xpath = "//input[@id='seats']")
    WebElement seatsInput;

//    @FindBy(css = "")
//    WebElement countOfSeats;

    @FindBy(xpath = "//input[@id='class']")
    WebElement carClassInput;

    @FindBy(xpath = "//input[@id='serialNumber']")
    WebElement regNumberInput;

    @FindBy(xpath = "//input[@id='price']")
    WebElement priceInput;

    @FindBy(css = "input[type='file']")
    WebElement addPhotos;
    public AddCarPage uploadPhoto(String path) {
        addPhotos.sendKeys(path);
        return this;
    }

    public AddCarPage fillCarForm() {
        locationInput.sendKeys("Haifa");
        okLocation.click();
        manufactureInput.sendKeys("Audi");
        modelInput.sendKeys("A6");
        yearInput.sendKeys("2021");
        fuelDropdown.click();
        fuelOptionDiesel.click();
        seatsInput.sendKeys("4");
        carClassInput.sendKeys("Luxury");
        regNumberInput.sendKeys("B-1234");
        priceInput.sendKeys("120");
        addPhotos.click();
        uploadPhoto("C:/Desktop/audi_a6_2021.jpg");
        return this;
    }

    @FindBy(css = "button[type='submit']")
    WebElement submitButton;
    public AddCarPage submitForm() {
        submitButton.click();
        return this;
    }

}
