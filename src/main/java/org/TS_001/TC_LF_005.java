package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LF_005 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Don't Enter anything to the Username field

        //Don't Enter anything to the Password field

        //Click on LogIn button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        try {
            boolean loggedIn = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The login process was completed.");
        }
        catch (Exception e){
            System.out.println("The login process was not completed.");
        }

        driver.close();


    }
}
