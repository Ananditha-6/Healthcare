Feature: Validate Forget Password functionality of Banking Applicatio
@test3
  Scenario Outline: Validate Forget password functionality of GroTechMind Banking Application
    Given user open the url of banking application
    And clicks on Forget Password button in Webpage
    And user enters email in Forget Password page as "<fp_email>"
    And user enters phone number in Forget Password page as "<fp_phone>"
    When user click  on forget password button
    Then user will get a success message in Forget Password page

    Examples: 
      | fp_email         | fp_phone  |
      | chandu@gmail.com | 587799090 |
