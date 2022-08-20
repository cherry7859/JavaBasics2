package com.syntax.class25;

import com.sun.jmx.snmp.tasks.Task;

public interface Task1WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements Task1WebDriver{
    @Override
    public void openBrowser(){

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }

}
 class FirefoxDriver implements Task1WebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}
