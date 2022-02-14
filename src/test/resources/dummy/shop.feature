Feature: Add to cart

  Rule: Add from store

    @Scenario1
  Scenario Outline: Add one quantity to the cart
    Given I'm on the store page
    When I add a "<product_name>" to the Cart
    Then I see <quantity> "<product_name>" in the cart

    Examples:
      | product_name | quantity |
      | Blueshoes   | 1        |



