package org.AutomationSelenium.pages.ProjectObjectModel;

import org.AutomationSelenium.base.CommonToAllPages;
import org.AutomationSelenium.utils.PropertiesReader;
import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class LoginPage extends CommonToAllPages {
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
    public void LoginToPsa() {
        openPSAUrl();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(compnayKey).sendKeys(PropertiesReader.readKey("PSAtenant"));
        clickElement(Nextbutton);
        webDriverWait.until(visibilityOfElementLocated(username)).sendKeys(PropertiesReader.readKey("PSAadminusername"));
        driver.findElement(password).sendKeys(PropertiesReader.readKey("PSApassword"));
        clickElement(Loginbutton);

    }

    public void LoginAsAdmin() {
        openPSAUrl();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(compnayKey).sendKeys(PropertiesReader.readKey("PSAtenant"));
        clickElement(Nextbutton);
        webDriverWait.until(visibilityOfElementLocated(username)).sendKeys(PropertiesReader.readKey("PSAadminusername"));
        driver.findElement(password).sendKeys(PropertiesReader.readKey("PSApassword"));
        clickElement(Loginbutton);
    }

    public void LoginAsUser() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        openPSAUrl();
        driver.findElement(compnayKey).sendKeys(PropertiesReader.readKey("PSAtenant"));
        clickElement(Nextbutton);
        webDriverWait.until(visibilityOfElementLocated(username));
        webDriverWait.until(visibilityOfElementLocated(username)).sendKeys(PropertiesReader.readKey("PSAusername"));
        driver.findElement(password).sendKeys(PropertiesReader.readKey("PSApassword"));
        clickElement(Loginbutton);
    }

    public void LoginAsSupervisor() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        openPSAUrl();
        driver.findElement(compnayKey).sendKeys(PropertiesReader.readKey("PSAtenant"));
        clickElement(Nextbutton);
        webDriverWait.until(visibilityOfElementLocated(username));
        webDriverWait.until(visibilityOfElementLocated(username)).sendKeys(PropertiesReader.readKey("PSAsupervisor"));
        driver.findElement(password).sendKeys(PropertiesReader.readKey("PSApassword"));
        clickElement(Loginbutton);
    }

    public void LoginAsCostManager() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        openPSAUrl();
        driver.findElement(compnayKey).sendKeys(PropertiesReader.readKey("PSAtenant"));
        clickElement(Nextbutton);
        webDriverWait.until(visibilityOfElementLocated(username));
        webDriverWait.until(visibilityOfElementLocated(username)).sendKeys(PropertiesReader.readKey("PSAcostmanager"));
        driver.findElement(password).sendKeys(PropertiesReader.readKey("PSApassword"));
        clickElement(Loginbutton);
    }

}