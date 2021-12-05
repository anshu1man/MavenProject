Feature: Check The Search Functionality at Google Search Engine
@smoke
  Scenario Outline: Check if User is able Search Successfully at Google
    Given Browser is open
    And Open a Google Search Engine
    When User enters the <Text> to be Searched
    And User clicks on Search button
    Then User Successfully navigate to<Text>

    Examples: 
      | Text     |
      | Tiger    |
      | Lion     |
      | Elephant |
