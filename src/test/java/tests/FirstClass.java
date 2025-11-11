package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstClass extends BaseTest {

    @Test
    public void positive() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        boolean registerBtnPresent = browser.findElement(By.xpath("//span[@data-test='title']")).isDisplayed();
        assertTrue(registerBtnPresent);
    }

    @Test
    public void negativ() {
        loginPage.open();
        loginPage.login("locked_out_user", "secret_sauce");
        assertEquals(loginPage.checkErrorMsg(), "Epic sadface: Sorry, this user has been locked out.");
    }
}
