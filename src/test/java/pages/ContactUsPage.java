package pages;

import com.codeborne.selenide.SelenideElement;
import utils.ConfigReader;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactUsPage {

    private SelenideElement nameField = $("#contact-us-form input[name='name']");
    private SelenideElement emailField = $("#contact-us-form input[name='email']");
    private SelenideElement textAreaField = $("#contact-us-form textarea");
    private SelenideElement submitButton = $("#contact-us-form input[type='submit']");
    private SelenideElement successAlertMessage = $("div.status.alert-success");

    public void openContactUsPage() {
        open("/contact_us");
    }



    public void fillAndSubmitForm() {
        nameField.setValue(ConfigReader.get("contact_us.name"));
        emailField.setValue(ConfigReader.get("contact_us.email"));
        textAreaField.setValue(ConfigReader.get("contact_us.textAreaMessage"));
        submitButton.scrollIntoView(true).click();
    }

    public void verifySuccessMessage() {
        successAlertMessage.shouldHave(text("Success!"));
    }
}
