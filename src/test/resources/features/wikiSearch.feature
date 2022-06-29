Feature: Wiki search functionallity and verifications
  @Test1
  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page2
    When User types "Steve Jobs" in the wiki search box2
    And User clicks wiki search button2
    Then User sees "Steve Jobs" is in the wiki title2

  Scenario: Wikipedia Search Functionality Header Verification2
    Given User is on Wikipedia home page2
    When User types "Steve Jobs" in the wiki search box2
    And User clicks wiki search button2
    Then User sees "Steve Jobs" is in the main headerg
