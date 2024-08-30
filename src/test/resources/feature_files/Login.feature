@Tutorialsninja

Feature: Login Functionality of Tutorialninja Application

@validcredentials
Scenario: Login with valid credentials
    Given User navigates to login page
    When User enters valid email "belioska05@gmail.com"
    And User enters valid password "Abnhg123"
    And User clicks on login button
    Then User is redirected to Account page
     
