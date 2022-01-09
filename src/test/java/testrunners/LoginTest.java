package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.BaseTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdefinitions"},
        plugin = {"pretty"})

public class LoginTest {

    @BeforeClass
    public static void setUp() {
        BaseTests.launchApplication();
    }


    @AfterClass
    public static void tearDown() {
        BaseTests.closeBrowser();
    }
}
