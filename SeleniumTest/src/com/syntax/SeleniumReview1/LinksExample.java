package com.syntax.SeleniumReview1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); //set driver you'll be using
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/index.php");
        //get all the links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link : links){
            String text = link.getText();
            String fullLink = link.getAttribute("href");
            if(!text.isEmpty()) {
                System.out.println(text + "   " + fullLink);
            }
            System.out.println(text);
        }

    }
}
