package com.bright.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateWebDriver {
    static  WebDriver driver;


    static WebDriver instance(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);

        }
        else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        return driver;
    }


}
