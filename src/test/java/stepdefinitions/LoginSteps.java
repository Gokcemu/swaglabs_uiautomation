package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.Page;
import utils.BaseTests;

public class LoginSteps {

    private WebDriver webDriver;
    protected LoginPage loginPage;
    protected Page currentPage;

    @Given(": User on Login Page")
    public void user_on_login_page() {
        loginPage = new LoginPage(BaseTests.getWebDriver());
    }

    @When(": User set username as {string} and password as {string} fields")
    public void user_set_username_as_and_password_as_fields(String username, String password) {
        loginPage.setUsername(username);
        loginPage.setPassword(password);
    }

    @And(": User click on login button")
    public void user_click_on_login_button() {

        loginPage.clickLoginButton();
    }

    @Then(": User must navigates the Home Page")
    public HomePage user_must_navigates_the_home_page() {

        return new HomePage(webDriver);
    }
}
