Feature: I want to be able to add 2 items to the cart and place an order

#    Background:
#      Given I am on the Home Page "http://automationpractice.com/index.php" of Shopping Website

  @puchase-positive @smokeTest
  Scenario: Display of search result
    Given I am on the Home Page "http://automationpractice.com/index.php" of Shopping Website
    When I search for "Dresses" in search bar
      And add first two items in Add to Cart to proceed
      And click proceed to checkout on Shopping-cart Summary page
      And user logs in Sign in Page
      And confirm Address on Address tab
      And Agree and confirm Shipping detail on Shipping page
      And confirm payment and select pay by check on Paymen page
      And click on final confirm order on "I Confirm My Order" button
      And confirm that order is placed by displaying message "Your order on My Store is complete."





