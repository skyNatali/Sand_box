package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver browser;

    private By loginInput = By.xpath("//input[@data-test='username']");
    private By passInput = By.xpath("//input[@data-test='password']");
    private By loginBtn = By.xpath("//input[@value='Login']");
    private By errorMsg = By.xpath("//h3[@data-test='error']");

    public LoginPage(WebDriver browser) {
        this.browser = browser;
        //this.wait = wait;
    }

    public void open() {
        browser.get("https://www.saucedemo.com/");
    }

    public void login(String loginName, String password) {
        browser.findElement(loginInput).sendKeys(loginName);
        browser.findElement(passInput).sendKeys(password);
        browser.findElement(loginBtn).click();
    }

    public String checkErrorMsg() {
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
        return browser.findElement(errorMsg).getText();
    }
}
