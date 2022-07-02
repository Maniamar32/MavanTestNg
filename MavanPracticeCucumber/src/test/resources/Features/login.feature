Feature: To test Login function
@smoketest
  Scenario: Check Login details
    Given user is on login page
    When user enters username ans password
    And clicks on login button
    Then user is navigate to home page
