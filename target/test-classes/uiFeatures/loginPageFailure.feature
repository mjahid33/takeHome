@regression
Feature: User validations for Login functionality

  Scenario: User should not be able to login using invalid credentials
    Given user navigates to Loginpage
    When user enters "whatever" Username
    Then user enters "what" Password
    Then user clicks on Login button
    And user validates "Your username is invalid!" Error Message

