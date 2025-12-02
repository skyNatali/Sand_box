package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import user.User;
import user.UserFactory;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login(UserFactory.withAdminPermission());
        assertTrue(productsPage.isPageOpen());
        assertEquals(productsPage.getTitleText(), "Products");
    }

    @DataProvider(name = "loginData")
    public Object[] loginData() {
        return new Object[][] {
                {UserFactory.withLockedUserPermission(), "Epic sadface: Sorry, this user has been locked out."},
                {UserFactory.withEmptyUsername(), "Epic sadface: Username is required"},
                {UserFactory.withEmptyPassword(), "Epic sadface: Password is required"}
        };
    }

    @Test(dataProvider = "loginData")
    public void incorrectLogin(User user, String errorMessage) {
        loginPage.open();
        loginPage.login(user);
        assertEquals(loginPage.checkErrorMsg(), errorMessage);
    }

    @Test
    public void checkGoodsAdded() {
        loginPage.open();
        loginPage.login(UserFactory.withAdminPermission());
        productsPage.addToCart("Sauce Labs Bike Light");
//        assertEquals(loginPage.checkErrorMsg(), "Epic sadface: Sorry, this user has been locked out.");
    }
}
