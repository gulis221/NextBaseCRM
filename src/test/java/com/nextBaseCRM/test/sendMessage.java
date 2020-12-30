package com.nextBaseCRM.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendMessage {

    public static void main(String[] args) {

        // set up webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://login2.nextbasecrm.com");
       driver.findElement(By.name("login-inp")).sendKeys("helpdesk7@cybertekschool.com");
       driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+ Keys.ENTER);

       String expectedTitle = "(33)Portal";
       String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("test passed!");
        }else {
            System.out.println("expectedResult = " + expectedTitle);
            System.out.println("actualResult = " + actualTitle);
            System.out.println("test failed!");
        }




    }
}
