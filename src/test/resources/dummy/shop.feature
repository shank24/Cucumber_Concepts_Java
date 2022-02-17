
Feature: Add to cart #1

  @featuretag
  Rule: Rule1

    Scenario Outline: Scenario 1
      Given I'm on the Store page
      When I add a "<product_name>" to the Cart
      Then I see 1 "<product_name>" in the cart

      @stage
      Examples:
        | product_name |
        | Blue Shoes   |

      @prod
      Examples:
        | product_name |
        | Red Shoes   |

  Scenario Outline: Scenario 2
      Given I'm on the Store page
      When I add a "<product_name>" to the Cart
      Then I see 1 "<product_name>" in the cart

      Examples:
        | product_name |
        | Blue Shoes   |


  Rule: Rule 2

    Scenario Outline: Scenario 3
      Given I'm on the Store page
      When I add a "<product_name>" to the Cart
      Then I see 1 "<product_name>" in the cart

      Examples:
        | product_name |
        | Blue Shoes   |
