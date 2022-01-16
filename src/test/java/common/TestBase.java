package common;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;
import pages.InventoryItem;
import pages.LoginPage;
import pages.InventoryPage;
import utils.Config;

import java.util.ArrayList;
import java.util.List;

public abstract class TestBase {
    protected WebDriver webDriver;
    protected LoginPage login;
    protected InventoryPage inventory;
    protected CartPage cart;
    protected List<InventoryItem> inventoryItems;

    public TestBase(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(Config.LOGIN_URL);
        webDriver.manage().window().fullscreen();
    }

    @AfterClass
    public void closeBrowser(){
        webDriver.quit();
    }

    public void login() {
        login(Config.DEFAULT_USER, Config.DEFAULT_PASSWORD);
    }

    public void login(String user, String password) {
        login = new LoginPage(webDriver);
        login.setUsername(user);
        login.setPassword(password);
        login.clickLoginButton();
        inventory = new InventoryPage(webDriver);
        inventoryItems = new ArrayList<>();

        /* Cart item and inventory items will be implement
        cart  = new Cart(webDriver);

        for (int id = 0; id < NUMBER_OF_ITEMS; id++  {
          inventoryItems.add(new InventoryItem(id, webDriver);
        } */
    }
}
