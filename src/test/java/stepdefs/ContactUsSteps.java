package stepdefs;

import io.cucumber.java.en.*;
import pages.ContactUsPage;

public class ContactUsSteps {
    ContactUsPage contact = new ContactUsPage();

    @Given("user navigate to contact us page")
    public void navigate_to_contact_us_page() {
        contact.openContactUsPage();
    }

    @When("user submit the contact form")
    public void submit_the_contact_form() {
        contact.fillAndSubmitForm();
    }

    @Then("user should see the success message")
    public void verify_success_message() {
        contact.verifySuccessMessage();
    }
}
