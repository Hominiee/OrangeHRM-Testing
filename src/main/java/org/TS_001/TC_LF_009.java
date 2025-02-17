package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LF_009 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Enter some text to Password field
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(1000);

        // Locate the password field and get the type attribute
        String fieldType = driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("type");
        Thread.sleep(1000);

        // Validate if the password is hidden
        if (fieldType.equals("password")) {
            System.out.println("Password is hidden.");
        } else {
            System.out.println("Password is visible.");
        }

        driver.quit();
    }
}