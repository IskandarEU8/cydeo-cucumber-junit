Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page I should be able to search whatever i want and see
  relevant information


  Scenario: Switching Google to English version
    When user is on Google search page
    Then User switches Google to English version


  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google




  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" and click enter
    Then user sees "apple" in the google title