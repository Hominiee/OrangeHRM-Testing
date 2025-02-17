package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LF_011 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Enter a valid Username
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(1000);

        //Enter a valid Password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(1000);

        //Click on LogIn button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        //Wait for 10 minutes
        Thread.sleep(600000);

        //Click on My Info tab (To perform a task)
        driver.findElement(By.xpath("//a[@href='/web/index.php/time/viewTimeModule']")).click();
        Thread.sleep(2000);

        try {
            boolean action = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The user remains logged in.");
        } catch (Exception e) {
            System.out.println("The user has logged out.");
        }

        driver.close();
    }
}
