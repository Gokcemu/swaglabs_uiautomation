package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public WebDriver webDriver;
    public By usernameField = By.xpath("//input[@placeholder='Username']");
    public By passwordField = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//input[@id='login_button_container']");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setPassword(String password) {
        webDriver.findElement(passwordField).sendKeys(password);
    }

    public void setUsername(String username) {
        webDriver.findElement(usernameField).sendKeys(username);
    }

    public String getErrorMessage() {
        return webDriver.findElement(errorMessage).getText();
    }

    public InventoryPage clickLoginButton() {
        webDriver.findElement(loginButton).click();
        return new InventoryPage(webDriver);
    }
}
