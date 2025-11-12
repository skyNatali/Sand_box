package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private By loginInput = By.xpath("//input[@data-test='username']");
    private By passInput = By.xpath("//input[@data-test='password']");
    private By loginBtn = By.xpath("//input[@value='Login']");
    private By errorMsg = By.xpath("//h3[@data-test='error']");

    public void open() {
        driver.get(BASE_URL);
    }

    public void fillInLogin(String loginName, String password) {
        fillInLogin(loginName);
        fillPassword(password);
        pressLoginBtn();

        public void login(String loginName) {
    driver.findElement(loginInput).sendKeys(loginName);
    }

    public void fillPassword(String password) {
        driver.findElement(passInput).sendKeys(password);
    }

    public void pressLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public String checkErrorMsg() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
        return driver.findElement(errorMsg).getText();
    }
}
