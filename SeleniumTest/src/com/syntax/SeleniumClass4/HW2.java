package com.syntax.SeleniumClass4;
/* HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();

        WebElement passwordEmptyMessage = driver.findElement(By.xpath("//span[text() = 'Password cannot be empty']"));
        boolean isPasswordEmptyMessageDisplayed = passwordEmptyMessage.isDisplayed();
        if(isPasswordEmptyMessageDisplayed) {
            System.out.println("The password empty message is displayed");
        } else {
            System.out.println("The password empty message failed to display");
        }

        driver.quit();
    }
}
