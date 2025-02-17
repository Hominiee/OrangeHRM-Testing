package org.TS_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FP_002 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Click on Forgot Password Link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        Thread.sleep(2000);

        //Enter a Invalid Username
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Udani");
        Thread.sleep(1000);

        //Click on Reset Password button
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")).click();
        Thread.sleep(2000);

        try {
            boolean PWchange = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-card-note orangehrm-forgot-password-card-note']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("Email sent.");
        } catch (Exception e) {
            System.out.println("Reset Process Failed.");
        }

        driver.close();
    }
}
