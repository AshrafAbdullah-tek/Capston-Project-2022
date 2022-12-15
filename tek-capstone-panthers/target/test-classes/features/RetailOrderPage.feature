Feature: Retail Order Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'farhad.jamaly@tekschool.us' and password 'Abc@123abc'
    And User click on login button
    And User should be logged in into Account

  # Scenario 13
  @placeOrderWithShippingAdd
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    #Given User is on retail website
    #When User click on Sign in option
    #And User enter email 'EmailValue' and password 'PasswordValue'
    #And User click on login button
    #And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon button
    And User click on that item
    And User select item quantity ‘5’
    And User click on add to Cart button
    Then The cart icon quantity should change to ‘5’
    And User click on the Cart option
    And User click on the Proceed to Checkout button
    And User click on the Place Your Order
    Then A message should be displayed ‘Order Placed, Thanks’

  # Scenario 14
  @cancelOrderTest
  Scenario: Verify User can cancel the order
    # Given User is on retail website
    # When User click on Sign in optionAnd User enter email 'EmailValue' and password 'PasswordValue'
    # And User click on login button
    # And User should be logged in into Account
    And User click on Orders section
    # And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  # Scenario 15
  @returnOrderTest
  Scenario: Verify User can Return the order
    #Given User is on retail website
    #When User click on Sign in option
    #And User enter email 'EmailValue' and password 'PasswordValue'
    #And User click on login button
    #And User should be logged in into Account
    And User click on Orders Section
    #And User click on first order in list
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a cancelation message should be displayed ‘Return was successful’

  # Scenario 16
  @writeReviewTest
  Scenario: Verify User can write a review on order placed
    #Given User is on retail website
    #When User click on Sign in option
    #And User enter email 'EmailValue' and password 'PasswordValue'
    #And User click on login button
    #And User should be logged in into Account
    And User click on the Orders section
    #And User click on first order in list
    And User click on Review button
    And User write Review headline 'headline value' and 'review text'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
