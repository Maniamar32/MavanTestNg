Feature: Test login functionality

  Scenario: Check login
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the home page
