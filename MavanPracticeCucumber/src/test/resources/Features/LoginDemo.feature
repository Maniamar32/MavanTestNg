Feature: Test login functionality

  Scenario: Check login
    Given first browser is open
    And user is working on login page
    When user enters username and password
    And clicks on login page
    Then user is navigated to the home page
