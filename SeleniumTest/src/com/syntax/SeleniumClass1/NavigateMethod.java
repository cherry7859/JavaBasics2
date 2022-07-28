package com.syntax.SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.navigate().to("http://www.google.com");
        driver.navigate().back(); // go back to Facebook
        driver.navigate().forward(); // go forward to Google
        Thread.sleep(2000); // pause the execution for 2 seconds
        driver.navigate().refresh(); // refresh the page

        //driver.close(); //close the current tab
        driver.quit(); // quit the whole browser
    }
}
