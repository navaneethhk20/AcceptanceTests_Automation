package org.AutomationSelenium.base;


import org.AutomationSelenium.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class CommonToAllTests {


    @BeforeMethod
    public void setUp(){
        DriverManager.init();

    }
    @AfterMethod
    public void closeBrowser(){
        DriverManager.down();
    }
}
