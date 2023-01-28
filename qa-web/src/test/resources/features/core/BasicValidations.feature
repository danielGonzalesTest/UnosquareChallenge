@validations
Feature: Basic Validations on Amazon.com

  @firstCase @removeItemFromCart
  Scenario: Make sure the item price doesn't vary between pages.
    Given I go to Amazon page
    When I search the "Samsung Galaxy Note 20" item on navbar
    # results page
    Then The Result page is displayed
    And I store the price of the first item found as "FirstItemPrice"
    When I click on the first item found
    # details page
    Then The Details page is displayed
    And The price displayed on the details page should be equal to "FirstItemPrice"
    When I click on Add to Cart
    # ShoppingCartPreview
    Then "Added to Cart" message is displayed
    Given I click on Cart on navbar
    #ShoppingCart
    Then The price displayed on the Shopping cart page should be equal to "FirstItemPrice"

  @secondCase @removeItemFromCart
  Scenario: Make sure the item price doesn't vary between pages.
    Given I go to Amazon page
    When I open Account & List menu on navbar
    And I click on Start here on menu displayed
    # Create Account Page
    When I fill out the following fields on Create Account form:
      | FIELD                  | VALUE                      |
      | Your Name              | user.employeeName          |
      | Mobile number or email | user.employeeName@fake.com |
    And I click on Conditions of Use
    # Conditions of Use Page
    When I search "Echo" on Find more solutions
    And I click on "Support for Amazon Echo" link
    # Support for Amazon Echo page
    Then The following elements should be displayed:
      | Getting Started              |
      | Wi-Fi and Bluetooth          |
      | Device Software and Hardware |
      | Troubleshooting              |
      | Learn More                   |
