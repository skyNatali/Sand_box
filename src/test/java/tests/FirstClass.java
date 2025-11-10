package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstClass extends BaseTest {

    @Test
    public void positive() {
        loginPage.open();
        loginPage.login("standard_user");
        loginPage.login("secret_sauce");
        boolean registerBtnPresent = browser.findElement(By.xpath("//span[@data-test='title']")).isDisplayed();
        assertTrue(registerBtnPresent);
    }

    @Test
    public void zipDigitCode() {
        loginPage.open();
        loginPage.login("12");
        assertEquals(loginPage.checkErrorMsg(), "Oops, error on page. ZIP code should have 5 digits");
    }
}

// Дополнительные команды для работы с alert и frame
//Alert alert = browser.switchTo().alert();
//alert.accept();
//browser.switchTo().frame("");
//browser.switchTo().defaultContent();