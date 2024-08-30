@tutorialnija

Feature: SearchProduct Functionality of Tutorialninja Application

@validsearchproduct
Scenario: Search with valid product 
   Given User navigates to search product
   And User enter valid product name
   And User click on search button
   Then User User is redirected to Products meeting the search criteria