package org.AutomationSelenium.base;


import junit.framework.Assert;
import org.AutomationSelenium.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class CommonToAllTests {
    WebDriver driver;
    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeMethod
    public void setUp(){
        DriverManager.init();

    }
    @AfterMethod
    public void closeBrowser(){
        DriverManager.down();
    }

}
