package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
    public static void main(String[] args) {
        //1. Set a system property
        System.setProperty("webdriver.chrome.driver", "/Users/cookie/IdeaProjects/JavaBasics2/SeleniumTest/drivers/chromedriver");

        //2. Create an object of WebDriver type
        WebDriver driver = new ChromeDriver();

        //3. Navigational commands
        driver.get("https:www.google.com");

        driver.navigate().to("https:www.facebook.com"); // navigate can track browser history to complete the actions below

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();
    }
}
