@smoke
Feature: Contact Us form

  Scenario: Submit contact us form successfully
    Given user navigate to contact us page
    When user submit the contact form
    Then user should see the success message
