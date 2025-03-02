package org.AutomationSelenium.pages.ProjectObjectModel.Normal;

import org.AutomationSelenium.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class LoginPage {
    //Page class
    //page locators

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locators
    private By compnayKey = By.id("CompanyNameTextBox");
    private By Nextbutton = By.id("NextButton");
    private By username = By.id("LoginNameTextBox");
    private By password = By.id("PasswordTextBox");
    private By Loginbutton = By.id("LoginButton");

    //Page Actions
    public void LoginToPsa() throws InterruptedException {
        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get(PropertiesReader.readKey("QAurl"));
        driver.findElement(compnayKey).sendKeys(PropertiesReader.readKey("PSAtenant"));
        driver.findElement(Nextbutton).click();
        webDriverWait.until(visibilityOfElementLocated(username));
        driver.findElement(username).sendKeys(PropertiesReader.readKey("PSAusername"));;
        driver.findElement(password).sendKeys(PropertiesReader.readKey("PSApassword"));
        driver.findElement(Loginbutton).click();
    }

}

