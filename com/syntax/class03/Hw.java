package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.xpath("//a[@id = 'btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class = 'list-group-item'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder = 'Please enter your Message']")).sendKeys("hi");
        driver.findElement(By.xpath("//button[@onclick = 'showInput();']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
