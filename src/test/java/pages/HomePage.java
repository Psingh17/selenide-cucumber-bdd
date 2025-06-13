package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private SelenideElement logo =  $("img[alt='Website for automation practice']");
    private SelenideElement loginLink = $("a[href='/login']");
    private SelenideElement loggedInUserLabel = $(By.xpath("//a[contains(text(),'Logged in')]"));

    public void openHomePage() {
        open("/");
    }

    public void verifyLogo() {
       logo.shouldBe(visible);
    }

    public void clicksOnLogin() {
        loginLink.click();
    }

    public String getLoggedInUserName() {
        System.out.println(loggedInUserLabel.getText());
        return loggedInUserLabel.getText();
    }
}
