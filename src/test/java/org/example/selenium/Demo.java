package org.example.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Demo {

    @Test
    public void automateLogin(){
        String email = "negop74982@orgria.com";
        System.out.println("launching chrome");
        System.setProperty("webdriver.chromedriver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://app.openlogin.com/");
        driver.findElement(By.xpath("//span[text()='Get Started']")).click();
        driver.findElement(By.xpath("//input[@name='passwordless-email']")).click();
        driver.findElement(By.xpath("//input[@name='passwordless-email']")).sendKeys(email);
        driver.findElement(By.xpath("//div[text()='Continue with Email']")).click();
        try {
            Thread.sleep(45000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.get("https://mail.yahoo.com");
//        driver.findElement(By.linkText("Sign in"));
//
//        driver.findElement(By.xpath("(//span[text()=''Web3Auth])[1]")).click();
//        driver.findElement(By.linkText("Approve login request")).click();



        Assert.assertTrue("verify welcome message", driver.findElement(By.xpath("//div[text()= 'Welcome, "+email+"']")).isDisplayed());
        driver.findElement(By.xpath("//span[text()='Account'']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Enable 2FA')]")).click();


    }
}
