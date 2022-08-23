Feature: Login page feature
  Scenario: Test login page functionality
    Given Login Page is open
    When User enter valid username and password
    And User click submit button
    Then Login page is successfully open