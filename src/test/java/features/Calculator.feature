@F_1234 		
Feature: Simple Calculator
  
  This feature will be creating a simple calulator for addition and subtraction

  Background: I have a calculator
    Given: Calculator is open and running


  Scenario: Find the sum of two numbers
    When I add 9 And 6
    Then I get the result 15

  Scenario: Find the difference between two numbers
    When I sub 25 And 9
    Then I get the result 16

  Scenario Outline: Find the sum of two numbers
    When I add <num1> And <num2>
    Then I get the result <result>

    Examples: 
      | num1 | num2 | result |
      |    6 |    8 |     14 |
      |   16 |   81 |     97 |

  Scenario Outline: Find the difference between two numbers
    When I sub <num1> And <num2>
    Then I get the result <result>

    Examples: 
      | num1 | num2 | result |
      |   25 |    9 |     16 |
      |   51 |   27 |     24 |

  Scenario: Add multiple numbers using data cucumber tables
    When I add below numbers
      | 4 |
      | 5 |
      | 7 |
      | 8 |
    Then I get the result 24

  Scenario: Add multiple numbers using data cucumber tables
    When I add below numbers using list
      |  4 |
      |  5 |
      |  7 |
      |  8 |
      | 10 |
    Then I get the result 34

  Scenario: To calculate the total bill of the order
    When I order below items
      | coffee | 23 |
      | donut  | 27 |
      | burger | 50 |
      | water  | 18 |
    Then I get the result 118

  Scenario: To calculate the total bill of the order using quantity
    When I order below items and quantity
      | coffee | 2 | 10 |
      | donut  | 1 |  5 |
      | burger | 1 | 15 |
      | water  | 2 |  3 |
    Then I get the result 46
