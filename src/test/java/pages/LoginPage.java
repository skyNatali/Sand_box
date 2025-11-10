package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver browser;

    private static final By USERNAME = By.xpath("//input[@id='user-name']");
    private static final By PASSWORD = By.xpath("//input[@value='Continue']");

    public LoginPage(WebDriver browser) {
        this.browser = browser;
        //this.wait = wait;
    }

    public void open() {
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
    }

    public void login(String zipCode) {
        browser.findElement(USERNAME).sendKeys(zipCode);
        browser.findElement(PASSWORD).click();
    }

    public String checkErrorMsg() {
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error_message")));
        return browser.findElement(By.cssSelector(".error_message")).getText();
    }
}
