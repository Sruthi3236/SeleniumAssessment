Feature: Login Flow

  Scenario: Log in with a valid account
    Given the user is on the login page
    When the user enters valid credentials
      | Email            | Password  |
      | john.doe@test.com| Test@1234 |
    And clicks on the "Sign In" button
    Then the user should be logged in successfully
