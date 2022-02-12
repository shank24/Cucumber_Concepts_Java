
@dummyFeatures
Feature: Add to cart

  As a customer of xyz app
  I want to add a product to the cart
  So that I can purchase the product


  Rule: Rule 1
    Background: This is a background

    @dummyScenario
    Scenario: Dummy Scenario 1
      Given I have a savings account
      And my account balance is $100
      Given I am dummy
      When I do dummy things
      Then dummy things happen

  #Other Steps -> And, But, *
  Rule: Rule 3
    Background: This is a background

    Scenario: Dummy Scenario 3
      Given I am at the grocery shop
      * I have banana and
      * I have cucumber
      * I have grapes


      When I do dummy things
      Then dummy things happen

  Rule: Rule 1
    Background: This is a background

    @dummyScenario
    Scenario: Dummy Scenario 1
      Given I have a savings account
      And my account balance is $100
      Given I am dummy
      When I do dummy things
      Then dummy things happen


#Feature -> user story
  # A feature can have multiple user story, but vis-a-vis not allowed
