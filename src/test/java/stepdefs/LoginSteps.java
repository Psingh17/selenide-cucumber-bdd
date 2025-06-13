package stepdefs;
import io.cucumber.java.en.When;
import pages.LoginPage;
public class LoginSteps {

    LoginPage login = new LoginPage();

    @When("user enters correct login {string} and {string}")
    public void enterValidLoginDetails(String userName, String password) {
        login.enterloginDetails(userName, password);
    }
    @When("clicks on login button")
    public void clicksOnLoginButton(){
        login.clickLoginButton();
    }
}
