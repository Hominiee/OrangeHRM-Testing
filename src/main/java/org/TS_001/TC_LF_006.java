package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LF_006 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Click on Forgot Password link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        Thread.sleep(3000);

        try {
            boolean ForgotPW = driver.findElement(By.xpath("//div[@class='orangehrm-card-container']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("Successfully navigated to the Forgot Password page.");
        }
        catch (Exception e){
            System.out.println("Unable to navigate to the Forgot Password page.");
        }

        driver.close();


    }
}
