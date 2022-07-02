Feature: User sorted on dropdown


  Background: User login sauce demo site
    Given User is on the login page
    And User enters "standard_user" and "secret_sauce"
    Then User clicks the login button

    @sorted1
  Scenario: User sorted as Name (A-Z)
    When User clicks the sorting dropdown
    And User clicks the "Name (A to Z)"
    Then User sees the all items sorted alphabetical
