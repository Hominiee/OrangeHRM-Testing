package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LF_012 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //To check the Logo availability
        try {
            boolean logo = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1721393199309']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The Logo is available.");
        } catch (Exception e) {
            System.out.println("The Logo is not available.");
        }

        //To check the Page Heading availability
        try {
            boolean logo = driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The Page Heading is available.");
        } catch (Exception e) {
            System.out.println("The Page Heading is not available.");
        }

        driver.close();
    }
}
