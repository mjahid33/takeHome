@regression
Feature: User validations for Alerts functionality


  Scenario: User should verify regular alert on Alerts Page
    Given user navigates to Alert Page
    When user clicks on JS JS Alert Button
    Then user asserts alert message
    Then user clicks on JS confirm Button and clicks ok on alert
    And user asserts the alert message
    Then user clicks on JS Prompt Button and types a message on Prompt
    And user asserts that the alert message contains the typed message
