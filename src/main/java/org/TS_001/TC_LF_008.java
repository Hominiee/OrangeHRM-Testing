package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LF_008 {
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

        //Click on Log Out button
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
        Thread.sleep(2000);

        //Click on Browser Back button
        driver.navigate().back();
        Thread.sleep(3000);

        try {
            boolean loggedIn = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The user get loggedin again.");
        } catch (Exception e) {
            System.out.println("The user did not get loggedin again.");
        }

        driver.close();
    }
}
