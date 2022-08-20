package com.syntax.SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /* Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        Login
        Get title and verify
        Logout
        close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); //creates variable via WebElement to be able to reuse
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.className("button")).click();
        String title = driver.getTitle();
        String expectedTitle = "Web Orders";
        if (title.equals(expectedTitle)) {
            System.out.println("Webpage title is correct");
        } else {
            System.out.println("Webpage title is incorrect");
        }
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
