package com.ilcarro.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

    protected WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void lunchBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void openURL(){
        driver.get("https://ilcarro.web.app");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void click(WebElement element){
        element.click();
    }

    public void type(WebElement element,String text){
        if (text!=null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public boolean isElementDisplayed(WebElement element){
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException exception){
            exception.getMessage();
            return false;
        }
    }

    public void tearDown() {
        driver.quit();
    }
}
