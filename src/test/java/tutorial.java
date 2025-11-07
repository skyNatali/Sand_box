import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class tutorial {
    @Test
    public void username() {
        WebDriver browser = new EdgeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        browser.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        browser.findElement(By.xpath("//input[@value='Login']")).click();
        boolean registerBtnPresent = browser.findElement(By.xpath("//span[@data-test='title']")).isDisplayed();
        assertTrue(registerBtnPresent);
        //browser.quit();
    }
}
