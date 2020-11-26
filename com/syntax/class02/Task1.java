package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /**
     * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
     * Login
     * Get title and verify
     * logout
     * close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_logout")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle1 = "Web Orders";
        if (actualTitle.equalsIgnoreCase(expectedTitle1)){
            System.out.println("Title match");
        }else{
            System.out.println("Title does not match");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}


