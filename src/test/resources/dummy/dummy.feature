
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
  Rule: Rule 2
    Background: This is a background

    Scenario: Dummy Scenario 2
      Given I am at the grocery shop
      * I have banana and
      * I have cucumber
      * I have grapes


      When I do dummy things
      Then dummy things happen

  Rule: Rule 3
    Background: This is a background

    @dummyScenario
    Scenario: Dummy Scenario 3
      Given I have a savings account
      And my account balance is $100
      Given I am dummy
      When I do dummy things
      Then dummy things happen


  @dummyScenario
  Scenario: Bank Scenario
    Given My Account Balance is $100
    When I withdraw $50
    Then the account balance should be $50


  Scenario: Bank Scenario
    Given My Account Balance is $50
    When I withdraw $50
    Then the account balance should be $0

    Scenario Outline: Bank Scenario
      Given My Account Balance is $<opening balance>
      When I withdraw $<withdrawal amount>
      Then the account balance should be $<closing balance>

      @QA
      Examples:
        | opening balance | withdrawal amount | closing balance |
        | 100             | 50                | 100             |
        | 50              | 50                | 0               |

      @UAT
      Examples:
        | opening balance | withdrawal amount | closing balance |
        | 100             | 50                | 100             |
        | 50              | 50                | 0               |




#Feature -> user story
  # A feature can have multiple user story, but vis-a-vis not allowed
# What vs How
  #BDD should be written around What part and How part is covered under Steps definition
#Background
  #Do not complicate
  #Keep it short
  #Expressive and vivid
  #Keep Scenarios short


