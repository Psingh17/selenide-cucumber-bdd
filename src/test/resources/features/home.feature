@regression @sanity
Feature: Home page and Login validation

  Scenario: Verify home page title and logo
    Given user open the homepage
    Then user should see the site logo

  Scenario Outline:Successful login with valid credentials
    Given user open the homepage
    When user clicks on Signup or Login link
    And user enters correct login "<email>" and "<password>"
    And clicks on login button
    Then user should see "Logged in as <username>"
    Examples:
      | email                     | password | username |
      | singhpranav2016@gmail.com | 107612   | Pranav   |
