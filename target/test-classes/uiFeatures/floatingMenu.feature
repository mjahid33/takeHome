@regression
Feature: This functionality validates scenario for floating menu

  Scenario: User should be able to check floating menu
    Given user navigates to the floating menu page
    When user scrolls the page
    Then asserts that the floating menu is still displayed