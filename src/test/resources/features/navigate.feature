Feature: HomePage
@Navigate
  Scenario: Verify HomePage title is displayed
    Given user lunches Chrome browser
    When user opens ilcarro HomePage
    Then user verifies HomePage title
    And user quits browser