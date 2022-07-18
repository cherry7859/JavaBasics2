package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        WebDriver chrome = new Chrome();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();
        //When store object inside parent, can just change name of object to avoid repeating code to test all

        WebDriver[] browsers = {new Chrome(), new Safari(), new Edge(), new Firefox()};

        for(WebDriver driver:browsers){ // Test on all the browsers
            driver.startBrowser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();

        }
    }
}
