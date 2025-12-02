package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static user.UserFactory.withAdminPermission;

public class ProductsTest extends BaseTest {

    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login(withAdminPermission());
        productsPage.isPageOpen();
        productsPage.addToCart(0);
        productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        productsPage.switchToCart();
        assertTrue(cartPage.getProductNames().contains("Test.allTheThings() T-Shirt (Red)"));
        assertEquals(cartPage.getProductNames().size(), 2);
        assertFalse(cartPage.getProductNames().isEmpty());
    }
}
