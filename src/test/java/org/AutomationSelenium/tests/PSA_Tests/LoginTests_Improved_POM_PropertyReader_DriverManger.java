package org.AutomationSelenium.tests.PSA_Tests;

import io.qameta.allure.Description;
import org.AutomationSelenium.base.CommonToAllTests;
import org.AutomationSelenium.driver.DriverManager;

import org.AutomationSelenium.pages.ProjectObjectModel.Improved.LoginPage;
import org.testng.annotations.Test;

public class LoginTests_Improved_POM_PropertyReader_DriverManger extends CommonToAllTests {
    @Description("Login as admin")
    @Test
    public void testLogin() throws InterruptedException {

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.LoginToPsa();

    }

}
