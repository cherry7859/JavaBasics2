package com.syntax.SeleniumClass4;
/*Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();

        WebElement syntaxLogo = driver.findElement(By.cssSelector("img[src *= 'syntax']"));
        boolean isSyntaxLogoDisplayed = syntaxLogo.isDisplayed();
        System.out.println(isSyntaxLogoDisplayed);

        driver.quit();

    }
}
