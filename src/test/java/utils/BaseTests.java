package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.Page;

public class BaseTests {

    public static WebDriver webDriver;
    public static Page loginPage;

    @BeforeClass
    public static void launchApplication(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(Links.LOGIN);
        loginPage = new LoginPage(webDriver);
    }

    @AfterClass
    public static void closeBrowser(){
        webDriver.quit();
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

}
