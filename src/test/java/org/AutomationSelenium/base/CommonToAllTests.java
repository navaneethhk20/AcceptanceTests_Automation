package org.AutomationSelenium.base;


import org.AutomationSelenium.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



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
