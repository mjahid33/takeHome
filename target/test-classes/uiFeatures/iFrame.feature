@regression
Feature: User validations for iFrames functionality

  Scenario: User should be able to enter a keyword into the text box on iFrames Page
    Given user navigates to iFrames page
    When user switch to the frame
    Then user types some text from into the frame
    And User verifies the written text