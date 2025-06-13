package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement emailField = $(By.name("email"));
    private  SelenideElement passwordField = $(By.name("password"));
    private SelenideElement loginButton = $("button[data-qa='login-button']");

    public void enterloginDetails(String userName, String password) {
        emailField.setValue(userName);
        passwordField.setValue(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
