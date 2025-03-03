package org.AutomationSelenium.tests.PSA_Tests;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import io.qameta.allure.Description;
import junit.framework.Assert;
import org.AutomationSelenium.base.CommonToAllTests;
import org.AutomationSelenium.driver.DriverManager;

import org.AutomationSelenium.pages.ProjectObjectModel.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.AutomationSelenium.driver.DriverManager.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginTests_POM_PropertyReader_DriverManger extends CommonToAllTests {

    LoginPage  loginPage = new LoginPage(DriverManager.getDriver());
    @Description("Verify PSA login")
    @Test
    public void verifyLogin(){
        LoginPage loginPage1 = new LoginPage(DriverManager.getDriver());
        loginPage1.LoginToPsa();
    }
    @Description("Login as admin")
    @Test
    public void testAdminLogin() {
        LoginPage loginPage2 = new LoginPage(DriverManager.getDriver());
        loginPage2.LoginAsAdmin();

    }
    @Description("Login as user")
    @Test
    public void testUserLogin(){
        LoginPage loginPage3 = new LoginPage(DriverManager.getDriver());
        loginPage3.LoginAsUser();
    }
    @Description("Login as user")
    @Test
    public void testSupervisorLogin(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        LoginPage loginPage4 = new LoginPage(DriverManager.getDriver());
        loginPage4.LoginAsSupervisor();
        String overview = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Overview']"))).getText();
        Assert.assertEquals("OVERVIEW", overview);

    }
    @Description("Login as user")
    @Test
    public void testCostManagerLogin(){
        LoginPage loginPage5 = new LoginPage(DriverManager.getDriver());
        loginPage5.LoginAsCostManager();
    }

}
