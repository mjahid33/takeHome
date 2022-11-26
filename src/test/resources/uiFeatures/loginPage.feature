@regression
Feature: User validations for Login functionality

  Scenario: User should be able to login using valid credentials
    Given user navigates to loginpage
    When user enters "tomsmith" username
    Then user enters "SuperSecretPassword!" password
    Then user clicks on login button
    And user validates successful login
