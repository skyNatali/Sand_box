package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver browser;

    private static final By USERNAME = By.xpath("//input[@data-test='username']");
    private static final By PASSWORD = By.xpath("//input[@data-test='password']");
    private static final By LOGIN = By.xpath("//input[@value='Login']");

    public LoginPage(WebDriver browser) {
        this.browser = browser;
        //this.wait = wait;
    }

    public void open() {
        browser.get("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        browser.findElement(USERNAME).sendKeys(username);
        browser.findElement(PASSWORD).sendKeys(password);
        browser.findElement(LOGIN).click();
    }

    public String checkErrorMsg() {
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container.error")));
        return browser.findElement(By.cssSelector(".error-message-container.error")).getText();
    }
}

