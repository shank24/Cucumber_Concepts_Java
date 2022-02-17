Feature: DataTable Demo

  Rule: Values from DataTable

    @Scenario3
    Scenario: SINGLE COLUMN WITH NO HEADER
      Given my credentials
      | username | john | john123 |
      | password | bill | bill123 |
      When I enter my credentials
      Then allow me to login










