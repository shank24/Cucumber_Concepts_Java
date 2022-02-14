Feature: Add to cart

  Rule: Add from store

    @Scenario1
  Scenario Outline: Add one quantity to the cart
    Given I'm on the store page
    When I add a product to the Cart
    Then I see 1 product in the cart
      And I see 2 products in the cart

    Examples:
      | product_name | quantity |
      | Blueshoes   | 1        |



