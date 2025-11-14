package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isPageOpen());
        assertEquals(productsPage.getTitleText(), "Products");
    }

    @Test
    public void incorrectLogin() {
        loginPage.open();
        loginPage.login("locked_out_user", "secret_sauce");
        assertEquals(loginPage.checkErrorMsg(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void emptyLogin() {
        loginPage.open();
        loginPage.login(" ", "secret_sauce");
        assertEquals(loginPage.checkErrorMsg(), "Epic sadface: Username is required");
    }

    @Test
    public void emptyPassword() {
        loginPage.open();
        loginPage.login("standard_user", " ");
        assertEquals(loginPage.checkErrorMsg(), "Epic sadface: Password is required");
    }

    @Test
    public void checkGoodsAdded() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Bike Light");
        //assertEquals(loginPage.checkErrorMsg(), "Epic sadface: Sorry, this user has been locked out.");
    }
}
