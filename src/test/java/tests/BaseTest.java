package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.time.Duration;

public class BaseTest {
    public WebDriver browser;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--guest");

        browser = new EdgeDriver(options);
        //options.addArguments("headless");
        //options.addArguments("window-size=1920, 1080");
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        loginPage = new LoginPage(browser);
    }

    @AfterMethod
    public void close() {
        browser.quit();
    }
}
