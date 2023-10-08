Feature: test google search

  Scenario: Validate google search is working
    Given brower is open
    And user is on search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
