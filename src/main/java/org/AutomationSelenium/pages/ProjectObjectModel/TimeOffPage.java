package org.AutomationSelenium.pages.ProjectObjectModel;



import org.AutomationSelenium.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.AutomationSelenium.driver.DriverManager.driver;

public class TimeOffPage extends CommonToAllPages {
    private By timeoffbtn = By.xpath("//button[contains(text(), 'BOOK TIME OFF')]");
    private By Submitforapproval = By.xpath("//button[text()='Submit for Approval']");
    private By refresh = By.id("jkkvacru");


    public void SubmitTimeoff() {
        navigateTimeOffPage();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement bookTimeOffButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(timeoffbtn));
        bookTimeOffButton.click();


    }
}
