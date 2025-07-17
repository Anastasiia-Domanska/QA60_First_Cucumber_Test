Feature: Add a new car
@addCar
  Scenario: Successful car addition
    Given user lunches Chrome browser
    When user opens ilcarro HomePage
    And user clicks on login link
    And user enters valid data
    And user clicks on Yalla button
    And user opens Add Car page
    And user fills out car form
    And user submits the car form
    Then car should be added successfully
