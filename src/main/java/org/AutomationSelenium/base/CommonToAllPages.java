package org.AutomationSelenium.base;

import org.AutomationSelenium.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.AutomationSelenium.driver.DriverManager.driver;
import static org.AutomationSelenium.driver.DriverManager.getDriver;

public class CommonToAllPages {
  public CommonToAllPages(){

  }
  public void openPSAUrl(){
    getDriver().get(PropertiesReader.readKey("QAurl"));
  }
  public void clickElement(By by){
    getDriver().findElement(by).click();
  }
  public void clickElement(WebElement by){
    by.click();
  }
  public void enterInput(By by, String key){
    getDriver().findElement(by).sendKeys(key);
  }
  public void enterInput(WebElement by, String key){
    by.sendKeys(key);
  }
  public WebElement presenceOfElement(By elementLocation) {
    return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
  }

  public WebElement visibilityOfElement(By elementLocation) {
    return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
  }
  public WebElement getElement(By key) {
    return getDriver().findElement(key);
  }

}
