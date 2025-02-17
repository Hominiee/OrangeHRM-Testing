package org.TS_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FP_004 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Click on Forgot Password Link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        Thread.sleep(2000);

        //Enter texts for Username field
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("abcd123");
        Thread.sleep(1000);

        //Click on Cancel button
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--ghost orangehrm-forgot-password-button orangehrm-forgot-password-button--cancel']")).click();
        Thread.sleep(2000);

        try {
            boolean PWchange = driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("Successfully Canceled.");
        } catch (Exception e) {
            System.out.println("Cancel Failed.");
        }

        driver.close();
    }
}
