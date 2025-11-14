package tests;

import org.testng.annotations.DataProvider;
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

    @DataProvider()
    public Object[] loginData() {
        return new Object[][] {
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"}
        };
    }

    @Test(dataProvider = "loginData")
    public void incorrectLogin(String user, String password, String errorMessage) {
        loginPage.open();
        loginPage.login(user, password);
        assertEquals(loginPage.checkErrorMsg(), errorMessage);
    }

    @Test
    public void checkGoodsAdded() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Bike Light");
        //assertEquals(loginPage.checkErrorMsg(), "Epic sadface: Sorry, this user has been locked out.");
    }
}
