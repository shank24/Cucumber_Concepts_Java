@featuretag
Feature: Add to cart #2

    Scenario Outline: Scenario 1
      Given I'm on the Store page
      When I add a "<product_name>" to the Cart
      Then I see 1 "<product_name>" in the cart

      Examples:
        | product_name |
        | Blue Shoes   |
