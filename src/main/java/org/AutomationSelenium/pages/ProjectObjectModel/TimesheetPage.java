package org.AutomationSelenium.pages.ProjectObjectModel;

import org.AutomationSelenium.base.CommonToAllPages;
import org.AutomationSelenium.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.AutomationSelenium.driver.DriverManager.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class TimesheetPage extends CommonToAllPages {


    private By addNew = By.xpath("//li[@role='presentation']//a[contains(@class, 'action')]");
    private By Submitforapproval = By.xpath("//button[text()='Submit for Approval']");
    private By refresh = By.id("jkkvacru");


    public void EnterTime() {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement addNewTimelineButton = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(addNew));
        addNewTimelineButton.click();

    }
}

//}
//// Option 1: Using ID (Most Recommended)
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//WebElement addNewTimelineButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-new-timeline")));
//addNewTimelineButton.click();
//
//// Alternative Option 2: Using Link Text
//WebElement addNewTimelineButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add New Timeline")));
//addNewTimelineButton.click();
//
//// Alternative Option 3: Using XPath
//WebElement addNewTimelineButton = wait.until(ExpectedConditions.elementToBeClickable(
//        By.xpath("//a[@id='add-new-timeline' and contains(@class, 'action')]")
//));
//addNewTimelineButton.click();
//
//// Alternative Option 4: Using CSS Selector
//WebElement addNewTimelineButton = wait.until(ExpectedConditions.elementToBeClickable(
//        By.cssSelector("a#add-new-timeline.action")
//));
//addNewTimelineButton.click();
