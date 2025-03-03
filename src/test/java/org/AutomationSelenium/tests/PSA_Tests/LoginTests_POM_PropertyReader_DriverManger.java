package org.AutomationSelenium.tests.PSA_Tests;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import io.qameta.allure.Description;
import junit.framework.Assert;
import org.AutomationSelenium.base.CommonToAllTests;
import org.AutomationSelenium.driver.DriverManager;

import org.AutomationSelenium.pages.ProjectObjectModel.LoginPage;
import org.openqa.selenium.By;
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
    @Description("Login as Supervisor")
    @Test
    public void testSupervisorLogin(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        LoginPage loginPage4 = new LoginPage(DriverManager.getDriver());
        loginPage4.LoginAsSupervisor();
        String overview = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Overview']"))).getText();
        Assert.assertEquals("OVERVIEW", overview);

    }
    @Description("Login as CostManager")
    @Test
    public void testCostManagerLogin(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        LoginPage loginPage5 = new LoginPage(DriverManager.getDriver());
        loginPage5.LoginAsCostManager();
        String app = waitForElemenet("//div[@role='tablist']/a[1]");
        String Approvals = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tablist']/a[1]"))).getText();
        Assert.assertEquals("APPROVALS", Approvals);
        String Timesheets = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tablist']/a[2]"))).getText();
        Assert.assertEquals("TIMESHEETS", Timesheets);
        String Time_Off = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tablist']/a[3]"))).getText();
        Assert.assertEquals("TIME OFF", Time_Off);
        String Expenses = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tablist']/a[4]"))).getText();
        Assert.assertEquals("EXPENSES", Expenses);
        String TimeWork_bench= webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tablist']/a[5]"))).getText();
        Assert.assertEquals("TIME WORKBENCH", TimeWork_bench);
    }

}
