Feature: IGIC Calculation

  Background:
    Given I have an IGIC calculator

  @ok
  Scenario: Zero rate IGIC
    When tax is calculated for "medicine" with 100 price
    Then the result should be 100

  @ok
  Scenario: Reduced rate IGIC
    When tax is calculated for "bread" with 100 price
    Then the result should be 103

  @ok
  Scenario: General IGIC
    When tax is calculated for "fruit" with 100 price
    Then the result should be 107

  @ok
  Scenario: Incremented IGIC
    When tax is calculated for "wine" with 100 price
    Then the result should be 112

  @ok
  Scenario: Special IGIC
    When tax is calculated for "diapers" with 100 price
    Then the result should be 120

  @ok
  Scenario Outline:  no-general IGIC
    When tax is calculated for "<product>" with <price> price
    Then the result should be <result>

    Examples:
      | product | price | result |
      |  bread  |  100  |  103   |
      |  wine   |  100  |  112   |


  @ko
  Scenario: Product with non-existent rate IGIC
    When tax is calculated for "panizo" with 100 price
    Then the product rate is not found