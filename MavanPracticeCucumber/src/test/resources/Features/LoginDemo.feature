Feature: Test login functionality

  Scenario Outline: Check login
    Given User is open google browser
    And user is working on login page
    When user enters <username> and <password>
    And user clicked on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Raghv    | mani123  |
      | hiiiiiii |    12345 |
