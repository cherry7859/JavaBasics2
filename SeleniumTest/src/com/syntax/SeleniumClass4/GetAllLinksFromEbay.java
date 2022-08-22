package com.syntax.SeleniumClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: " + allLinks.size());

        //print all the link text from webpage
        for (WebElement link : allLinks) {
            String linkText = link.getText();
            String fullLink = link.getAttribute("href");
            if (!linkText.isEmpty()) { //removes the links that don't have text (the gaps when printing)
                System.out.println(linkText + "    " + fullLink);
            }
        }

        driver.quit();
    }
}
