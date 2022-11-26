@regression

Feature: User validations for Notification Message functionality

  Scenario Outline : User should be able to handle a Notification Message
    Given user navigates to Notification Message Page
    When user clicks on the Click Here link a multiple times
    And user asserts that one of the <message>

    Examples:
   | message          |
   | Action successful|
   |Action unsuccesful, please try again|
