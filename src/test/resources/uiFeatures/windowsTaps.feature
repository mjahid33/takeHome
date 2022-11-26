@regression

Feature: User validations for Tabs and Windows functionality

  Scenario: User should be able to handle a new window
    Given user navigates to Tabs and Windows Page
    When user clicks on the Click Here link
    Then user asserts that a new tab is opened with text New Window