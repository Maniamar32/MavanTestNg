Feature: Login to the omayo application

Scenario Outline: User should only be able to login with valid credentials

Given I navigate to application URL
When I enter Username as "<username>" and Password as "<password>" into the fields 
And I click on Login button
Then User should be able to login based on "<expected>" login status
Examples: 
       |username              |password             |expected|
       |SeleniumByArun  |Test143$               |Success|