package com.syntax.SeleniumClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
   public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
      WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); //creates variable via WebElement to be able to reuse
      username.sendKeys("Tester");
      WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
      password.sendKeys("test");

      //Using WebElement variables to clear out the fields
      Thread.sleep(2000);
      username.clear();
      password.clear();
      Thread.sleep(2000);

      driver.quit();
   }
}
