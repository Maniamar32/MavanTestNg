Feature: test google search functionality

  Scenario: validate google search
    Given browser is open
    And user is on google search page
    When user enter  a text in searchbox
    And click enter
    Then user is navigated to search results
