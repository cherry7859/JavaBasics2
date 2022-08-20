package com.syntax.SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        firstName.sendKeys("Cherylle");
        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("Finley");
        WebElement contact = driver.findElement(By.xpath("//input[contains(@name, 'email__')]"));
        contact.sendKeys("713-444-2348");
        WebElement password = driver.findElement(By.xpath("//input[@autocomplete = 'new-password']"));
        password.sendKeys("easyst123");
        WebElement signUp = driver.findElement(By.xpath("//button[@name = 'websubmit']"));
        signUp.click();
        Thread.sleep(3000);
        WebElement closeWindow = driver.findElement(By.xpath("//img[contains(@src, 'zgulV2zGm8t')]"));
        closeWindow.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
