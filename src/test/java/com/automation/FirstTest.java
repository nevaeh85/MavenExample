package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //object of browser
        driver.get("https://www.ebay.com/");

        Thread.sleep(2000);

        driver.manage().window().maximize();

        driver.quit();
    }

    @Test
    public void secondTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //object of browser
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.quit();
    }
    @Test
    public void thirdTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //object of browser
        driver.get("https://www.target.com/");

        driver.manage().window().maximize();

        driver.quit();
    }
}
