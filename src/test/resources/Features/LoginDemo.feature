
Feature: Test Login Funcionality

  Scenario: Check login is successfull with valid credentials
    Given browser is open
    And user is on login page
    When users enter username and password
    And users click in submit
    Then user is navigated to the home page
    
	Scenario: Check login is successfull with invalid credentials
    Given browser is open
    And user is on login page
    When users enter username and password invalids
    And users click in submit
    Then user view error message text is Your username is invalid!


