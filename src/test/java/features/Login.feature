@F_Login
Feature: This feature will be used to design the Login page of the application

  Background: Open the application
    Given I have opened the application in browser

	@Sanity
  Scenario: Validate successful login
    When I click on the Login link
    And I enter username
    And I enter password
    And I click on the Login Button
    Then I should be landed on the Login page

  #This is a comment
  @Regression @Sanity
  Scenario: Validate successful login using test data
    When I click on the Login link
    And I enter username "abc@xyz.com"
    And I enter password "Pqr@1234"
    And I click on the Login Button
    Then I should be landed on the Login page

  @Regression @Rapid
  Scenario Outline: Validate successful login using multiple test data
    When I click on the Login link
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the Login Button
    Then I should be landed on the Login page

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | Pqr@1234 |
      | stu@xyz.com | Dfr@5432 |
      
    
    Scenario: Validate negative login using test data
    When I click on the Login link
    And I enter username "abc@xyz.com"
    And I enter password "Pqr@1234"
    And I click on the Login Button
    Then I should be get the error message "The email or password you have entered is invalid."
