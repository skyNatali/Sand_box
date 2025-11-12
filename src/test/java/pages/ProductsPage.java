package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    private static final String ADD_TO_CART = "//button[@data-test='add-to-cart-sauce-labs-backpack']";

    private By title = By.xpath("//span[@data-test='title']");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean getTitle() {
        return driver.findElement(title).isDisplayed();
    }

    public String getTitleText() {
        return driver.findElement(title).getText();
    }
}
