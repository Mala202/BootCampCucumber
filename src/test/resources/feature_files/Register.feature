@Tutorialsninja

Feature: Register Functionality of Tutorialninja Application

@validcredentials
Scenario: Register with valid credentials
    Given User navigates to Register page
    When User enters valid FirstName "Mania"
    And User enters valid LastName "Maria"
    And User enters valid Email "belioska05@gmail.com"
    And User enters valid Telephone "8896359565"
    And User enters valid password "Abnhg123"
    And User enters valid password confirm "Abnhg123"
    And User click yes subscribe radio button
    And User clicks on privacy policy 
    And User clicks on continue button
    Then User is redirected to Account Success Page
     

