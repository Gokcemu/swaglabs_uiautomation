package stepdefinitions;

import common.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.InventoryPage;
import utils.Config;


public class LoginSteps extends TestBase {
    @Given(": User on Login Page")
    public void user_on_login_page() {
        login = new LoginPage(webDriver);
    }

    @When(": User set username and password fields")
    public void user_set_username_and_password_fields() {
        login.setUsername(Config.DEFAULT_USER);
        login.setPassword(Config.DEFAULT_PASSWORD);
    }

    @And(": User click on login button")
    public void user_click_on_login_button() {
        login.clickLoginButton();
    }

    @Then(": User must navigates the Home Page")
    public InventoryPage user_must_navigates_the_home_page()  {

        return new InventoryPage(webDriver);
    }
}