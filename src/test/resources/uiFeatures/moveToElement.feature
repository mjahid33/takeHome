@regression
Feature: This functionality validates scenarios for MoveToElement Page

  Scenario: User should be able to hover over images
    Given user navigates to hover over page
    When user hovers over on each image
    Then user verifies that additional information is displayed for each image

