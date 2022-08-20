package com.syntax.SeleniumClass3;
/*Navigate to http://syntaxprojects.com
        Click on start practicing
        click on simple form demo
        enter any text on first text box
        click on show message
        quit the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startPracticing = driver.findElement(By.xpath("//a[text() = \" Start Practising \"]"));
        startPracticing.click();
        Thread.sleep(3000);
        WebElement formDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        formDemo.click();
        Thread.sleep(3000);
        WebElement yourMessage = driver.findElement(By.xpath("//input[contains(@placeholder, 'your Message')]"));
        yourMessage.sendKeys("Cherylle");
        WebElement showMessage = driver.findElement(By.xpath("//button[@onclick = 'showInput();']"));
        showMessage.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
