Feature: Wikipedia search functionality
  Agile story: As a user, when I am on the Wikipedia home page
  I should be able to search whatever I want and see relevant information

  #WSF-45234 --> example of jira ticket number. Either pass this number or agile story.

  Scenario: Wikipedia Search Page Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User click wiki search button
    Then User sees "Steve Jobs" is in the main header

  @ScenarioOutline:
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Anne Hathaway     | Anne Hathaway     | Anne Hathaway      |
      | Elon Musk         | Elon Musk         | Elon Musk          |
      | Angelina Jolie    | Angelina Jolie    | Angelina Jolie     |
      | Marie Curie       | Marie Curie       | Marie Curie        |
