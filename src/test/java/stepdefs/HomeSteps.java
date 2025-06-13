package stepdefs;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;

public class HomeSteps {
    HomePage home = new HomePage();

    @Given("user open the homepage")
    public void open_the_homepage() {
        home.openHomePage();
    }
    @Then("user should see the site logo")
    public void verify_the_site_logo() {
        home.verifyLogo();
    }
    @When("user clicks on Signup or Login link")
    public void clicks_login_link() {
        home.clicksOnLogin();
    }
    @Then("user should see {string}")
    public void verifyLoginMessage(String message) {
        Assert.assertTrue(home.getLoggedInUserName().contains(message));
    }
}
