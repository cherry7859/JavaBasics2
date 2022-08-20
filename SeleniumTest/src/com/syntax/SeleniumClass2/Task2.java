package com.syntax.SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Cherylle");
        driver.findElement(By.name("customer.lastName")).sendKeys("Finley");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Easy St.");
        driver.findElement(By.name("customer.address.city")).sendKeys("Houston");
        driver.findElement(By.id("customer.address.state")).sendKeys("TX");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("77477");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("713-444-2347");
        driver.findElement(By.name("customer.ssn")).sendKeys("3625435478");
        driver.findElement(By.id("customer.username")).sendKeys("cfinley");
        driver.findElement(By.name("customer.password")).sendKeys("easyst");
        driver.findElement(By.id("repeatedPassword")).sendKeys("easyst");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
