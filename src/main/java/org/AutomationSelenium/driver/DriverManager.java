package org.AutomationSelenium.driver;

import org.AutomationSelenium.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }
    public static void setDriver(WebDriver driver){
        DriverManager.driver =driver;
    }
    public static void init() {
        String brwoser = PropertiesReader.readKey("browser");
        brwoser = brwoser.toLowerCase();
        if (driver == null) {
            switch (brwoser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--guest");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--start-maximized");
                    firefoxOptions.addArguments("--guest");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    edgeOptions.addArguments("--guest");
                    driver = new EdgeDriver(edgeOptions);
                    break;
                default:
                    System.out.println("Not browser Found!!");
            }
        }
    }

public static void down(){
    if(driver!= null){
        driver.quit();
        driver=null;
    }
}
}
