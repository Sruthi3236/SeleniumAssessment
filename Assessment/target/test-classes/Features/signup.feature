Feature: Signup Flow

  Scenario: Create a new account on the Magento website
    Given the user is on the signup page
    When the user enters valid details
      | FirstName | LastName  | Email            | Password  | ConfirmPassword |
      | John      | Doe       | john.doe@test.com| Test@1234 | Test@1234       |
    And clicks on the "Create an Account" button
    Then the account should be created successfully
