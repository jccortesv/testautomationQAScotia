@featureTest
Feature: End-to-end Standard User process on SauceDemo page 
This feature describes the whole E2E process for Standard User (standard_user) on SauceDemo page, from log in, selecting a product, 
add it to the cart, checkout and finally log out.

@Scenario1
Scenario: Check the process of standard_user user when logs in, selects a product and generates the checkout.

Given I access to SauceDemo page
When I login with standard_user user
Then the page shown is inventory.html
And standard_user can select a product detail
And standard_user can click on Cart button
And standard_user can click on Checkout button
And standard_user can fill First Name, Last Name and Zip/Postal code fields correctly
And standard_user can click on Finish button
And the page shows order confirmation page for the product selected