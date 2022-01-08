package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;

public class BaseTests {
    private static WebDriver webDriver;
    protected static Page loginPage;

    @BeforeClass
    public static void launchApplication() {
        setChromeDriverProperty();
        webDriver = new ChromeDriver();
        webDriver.get(Links.LOGIN);
        loginPage = new Page();
    }

    @AfterClass
    public static void closeBrowser() {
        webDriver.quit();
    }

    private static void setChromeDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    }

}
