@tutorialnija

Feature: AddToCart Functionality of Tutorialninja Application

@validAddToCart
Scenario: Add To Cart with valid product 
   Given User navigates to search product
   And User enter valid product name "Hp"
   And User click on search button
   Then User User is redirected to Products meeting the search criteria
   And User click on Add to Cart
   Then User is redirected to products page
   And User click on Add to Cart
   Then User resived Success: You have added HP LP3065 to your shopping cart!
   
