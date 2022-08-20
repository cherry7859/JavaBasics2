package com.syntax.class26;

public interface Task1WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver. */

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements Task1WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in Chrome browser");
    }
}

class Firefox implements Task1WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in Firefox browser");
    }
}

