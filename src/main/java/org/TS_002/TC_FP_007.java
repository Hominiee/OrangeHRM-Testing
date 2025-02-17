package org.TS_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FP_007 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Click on Forgot Password Link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        Thread.sleep(2000);

        try {
            boolean Logo = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_logo.png']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The Logo is available.");
        } catch (Exception e) {
            System.out.println("The Logo is not available.");
        }

        driver.close();
    }
}
