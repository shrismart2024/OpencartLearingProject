Feature: Registraition functionality scenarios
Background:
Given I launch the application

  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I navigate to My Account
    And I click on Registration page
    When I provide <FirstName> <LastName> <Email> <Telephone> <Password>
    Then message is diplayed
	Examples:
      | FirstName | LastName | Email          | Telephone | Password |
      | Mamta     | sdfsfs   | dsfd@gmail.com | 232423232 | fdfdf    |
      
  Scenario: Registering an Account by Not providing Mandatory fields
    Given I navigate to My Account
    And I click on Registration page
    When I do not provide and click on Continue
    Then Warning message should displayed
