Tutorial

//        browser.get("https://www.saucedemo.com/");
//        browser.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
//        browser.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
//        browser.findElement(By.xpath("//input[@value='Login']")).click();
//        boolean registerBtnPresent = browser.findElement(By.xpath("//span[@data-test='title']")).isDisplayed();
//        assertTrue(registerBtnPresent);
//        browser.quit();
//    }
//
//    @Test
//    public void user_name() {
//        WebDriver browser = new EdgeDriver();
//        browser.get("https://www.saucedemo.com/");
//        browser.findElement(By.xpath("//input[@data-test='username']")).sendKeys("locked_out_user");
//        browser.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
//        browser.findElement(By.xpath("//input[@value='Login']")).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String errorText = browser.findElement(By.cssSelector(".error-message-container.error")).getText();
//        assertEquals(errorText, "Epic sadface: Sorry, this user has been locked out.");
//        browser.quit();
//    }
//}
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

Fiat
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FirstClass {

        @Test
        public void zipCode() {
            WebDriver browser = new EdgeDriver();
            browser.get("https://www.sharelane.com/cgi-bin/register.py");
            browser.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("12345");
            browser.findElement(By.xpath("//input[@value='Continue']")).click();
            boolean registerBtnPresent = browser.findElement(By.xpath("//input[@value='Register']")).isDisplayed();
            assertTrue(registerBtnPresent);
            //browser.quit();
        }

        @Test
        public void zipDigitCode() throws InterruptedException {
            WebDriver browser = new EdgeDriver();
            browser.get("https://www.sharelane.com/cgi-bin/register.py");
            browser.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("12");
            browser.findElement(By.xpath("//input[@value='Continue']")).click();
            Thread.sleep(1000);
            String errorText = browser.findElement(By.cssSelector(".error_message")).getText();
            assertEquals(errorText, "Oops, error on page. ZIP code should have 5 digits");
            browser.quit();
        }
    }
=======
import static java.lang.Thread.*;
import static org.testng.Assert.*;

public class FirstClass {

    @Test
    public void zipCode() {
        WebDriver browser = new EdgeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("12345");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        boolean registerBtnPresent = browser.findElement(By.xpath("//input[@value='Register']")).isDisplayed();
        assertTrue(registerBtnPresent);
        browser.quit();
    }

    @Test
    public void zipDigitCode() throws InterruptedException {
        WebDriver browser = new EdgeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("12");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        Thread.sleep(1000);
        String errorText = browser.findElement(By.cssSelector(".error_message")).getText();
        assertEquals(errorText, "Oops, error on page. ZIP code should have 5 digits");
        browser.quit();
    }
}

master
master
