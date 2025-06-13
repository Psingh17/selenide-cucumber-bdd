
Feature: Product Page items validation

  Scenario: Verify various products available in the Product page
    Given user open the product page
    Then user should see the products contains the following products:
    |Winter Top|
    |summer White top|
    |Pure Cotton Neon Green tshirt|