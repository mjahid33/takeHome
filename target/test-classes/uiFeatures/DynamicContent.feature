@regression
Feature: This functionality validates scenario for dynamic content

  Scenario: User should be able to  assert that the content changes on each refresh.
    Given user navigates to the dynamic content
    And user asserts that the content changes on each refresh