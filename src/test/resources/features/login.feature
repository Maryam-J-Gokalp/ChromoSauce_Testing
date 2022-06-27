Feature: User Should be login with valid credential
  User Story: User should be login with valid credential

  @login
  Scenario: User logins on the sauce demo page
    Given User is on the login page
    Given User enters "standard_user" and "secret_sauce"
    When User clicks the login button
    Then User should see the home page