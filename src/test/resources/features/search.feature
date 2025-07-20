Feature: Search car
@search
  Scenario: User searches for a car
    Given user lunches Chrome browser
    When user opens ilcarro HomePage
    And user clicks on login link
    And user enters valid data
    And user clicks on Yalla button
    And User is on the search page
    And User enters location "Haifa" and dates
    And User clicks on Yalla button
    Then Car search results should be displayed
