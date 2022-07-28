package com.syntax.SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /* 1. Launch the Browser
        2. Navigate to Amazon website
        3. Print out the title and the url in the console
        4. Close the browser
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title+" "+url);
        driver.quit();
    }

}
