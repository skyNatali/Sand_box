import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

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
