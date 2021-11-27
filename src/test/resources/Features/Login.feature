 Feature: Check The Login Functionality

 
  Scenario: Check if User is able To login Successfully Using Valid Credentials
    Given User is on login Page
    When User enters valid username and password
    And User clicks on login button
    Then User Successfully navigate to home page
