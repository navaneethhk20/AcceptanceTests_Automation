package org.AutomationSelenium.tests.PSA_Tests;

import io.qameta.allure.Description;
import org.AutomationSelenium.base.CommonToAllTests;
import org.AutomationSelenium.pages.ProjectObjectModel.Normal.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests_POM extends CommonToAllTests {
    @Description("Login as admin")
    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginToPsa();

    }


}
