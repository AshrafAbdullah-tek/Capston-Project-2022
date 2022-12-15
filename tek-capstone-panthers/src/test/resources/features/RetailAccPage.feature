Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'farhad.jamal@tekschool.us' and password 'Abc@123abc'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @AccUpdateTest
  Scenario: Verify User can update Profile Information
    And User update Name 'Qand Agha' and Phone '703 444 0987'
    And User click on Update button
    Then user profile information should be updated

  @UpdatePassTest
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@1234599      | Abc@123abc  | Abc@123abc      |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @addPaymentMethodTest
  Scenario: Verify User can add a payment method
    # When User click on Account option
    # And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2123653487094508 | Jamalludin |              04 |           2027 |          078 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  #Scenario 6
  @editDebitCreditCardTest
  Scenario: Verify User can edit Debit or Credit card
    # When User click on Account option
    And User click on Master Card
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 2123653487094520 | Jamal Ahmad |              12 |           2035 |          456 |
    And User click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  #Scenario 7
  @removePaymentDetailsTest
  Scenario: Verify User can remove Debit or Credit card
    And User click on Master Card
    # When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  #Scenario 8
  @addAddressTest
  Scenario: Verify User can add an Address
    # When User click on Account option
    And User click on Add address option
    And User fill address form with below information
      | country       | fullName    | phoneNumber  | streetAddress    | apt | city    | state    | zipCode |
      | United States | Jamal Ahmad | 703 888 9090 | 6565 Main Street | 410 | Herndon | Virginia |   20151 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully’

  #Scenario 9
  @editAddressTest
  Scenario: Verify User can edit an Address added on account
    #When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress | apt | city          | state    | zipCode |
      | United States | Ahmad Jamal |  2509802626 | 6245 64th Ave |   4 | Silver Spring | Maryland |   55144 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  #Scenario 10
  @removeAddTest
  Scenario: Verify User can remove Address from Account
    #When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

  @smartHomeTest
  #Scenario 10
  Scenario: Verify User can add an item to cart
    #Given User is on retail website
    #When User click on Sign in option
    #And User enter email 'EmailValue' and password 'PasswordValue'
    #And User click on login button
    #And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    
    #Scenario 11
  @addItemToCart
  Scenario: Verify User can add an item to cart
    #Given User is on retail website
    #When User click on Sign in option
    #And User enter email 'EmailValue' and password 'PasswordValue'
    #And User click on login button
    #And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’
    
    #Scenario 12
    @placeOrderTest
        Scenario: Verify User can place an order without Shipping address and payment Method on file
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address with below information
      | country       | fullName     | phoneNumber | streetAddress     | apt | city    | state    | zipCode |
      | United States | Jamal Ahmad |  2406516060 | 120 Lessburg Pike | 102 | Fairfax | Virginia |   22322 |
    And User click on Add Your Address button
    And User click Add credit card or Debit Card for Payment method
    And User fill new Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2132435465768721      | Ahmad Jamal      | 9           | 2027          | 260        |
    And User click Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’
    
    
    
