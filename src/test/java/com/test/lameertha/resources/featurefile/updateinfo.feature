Feature:  Update Personal Information Functionality
  As a user I want to Update Personal Information (First Name) in My Account

  Scenario: User should able To Update Personal Information (FirstName) page successfully
    Given I am on home Page
    When  I click on Sign In Button
    And   I enter the EmailAddress "lameertha11@gmail.com"
    And   I enter the Password "Lamee1988"
    And I SingIn Button2
    And Click on the Personal Information Button
    And Updating My First Name "LAMEE"
    And Enter the old password "Lamee1988"
    And Click the Save Button
    Then I should able to see the Update Personal Information (First Name) page successfully "LAMEE"