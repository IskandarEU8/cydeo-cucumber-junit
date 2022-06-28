Feature: Wiki search functionality
  Agile story: As a user, when I am on Wikipedia web-site I should be able
  to search for a relevant information.

  #WSF-45234
  @Jobs
  Scenario: Search for Steve on Wikipedia
    Given user is on Wikipedia page
    And users searches for "Steve Jobs"
    Then user sees "Steve Jobs" in the title
