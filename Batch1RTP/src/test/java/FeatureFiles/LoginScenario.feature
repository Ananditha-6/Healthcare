Feature: Validate Login functionality of Banking Domain
@test2
  Scenario Outline: Validate Login functionality of GroTechMind Banking Domain
    Given user open the url of banking application
    And clicks on Log in button in Webpage
    And user enters username as "<username>"
    And user enters password as "<password>"
    When user click  on Login button
    Then user will get a success message from the website

    Examples: 
      | username | password |
      | 137840   | Test@123  |