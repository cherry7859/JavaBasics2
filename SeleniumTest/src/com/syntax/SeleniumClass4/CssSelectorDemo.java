package com.syntax.SeleniumClass4;
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

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startPracticing = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticing.click();
        Thread.sleep(3000);
        WebElement formDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        formDemo.click();
        Thread.sleep(3000);
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder ^= 'Please enter']"));
        textBox.sendKeys("Sameer loves Absolute xpath");
        WebElement showMessage = driver.findElement(By.cssSelector("button[onclick *= 'Input();']"));
        showMessage.click();
        Thread.sleep(3000);

        driver.quit();



    }
}
