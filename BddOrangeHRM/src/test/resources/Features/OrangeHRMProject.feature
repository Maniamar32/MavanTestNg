Feature: Login Validation Test

  Scenario Outline: User Validate OrangeHRM login Credentials
    Given user connect the browser
    When user on OrangeHRM login page
    Then enter <username> and <password>
    And click the enter Login button
    Then user into welcome page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | admin    | admin123 |
      | Admin    | admin    |
