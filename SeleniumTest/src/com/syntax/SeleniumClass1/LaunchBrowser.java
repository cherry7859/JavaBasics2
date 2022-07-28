package com.syntax.SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver(); // launch the browser by creating an object of the WebDriver interface
        driver.get("http://www.google.com"); // navigate to Google browser
        String url = driver.getCurrentUrl(); // get current url we just navigated to
        System.out.println(url); // print the url
        String title =  driver.getTitle(); // gather the title of the webpage
        System.out.println(title); // print the title of webpage
        driver.quit();

    }
}
