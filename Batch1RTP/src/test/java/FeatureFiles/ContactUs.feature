Feature: Validate Contact Us functionality of Banking Domain
@test4
  Scenario Outline: Validate Contact Us functionality of GroTechMind Banking Domain
    Given user open the url of banking application
    And user clicks on ContactUs button in WebPage
    And user enters name as "<contact_name>"
    And user enters email as "<contact_email>"
    And user enters phone as "<contact_phone>"
    And user enters address as "<contact_address>"
    And user enters country as "<contact_country>"
    And user enters pincode as "<contact_pin>"
    When user clicks on Submit button in ContactUs page
    Then user will get a success message in ContactUs page

    Examples: 
      | contact_name | contact_email     | contact_phone | contact_address | contact_country | contact_pin |
      | ritika       | rithika@gmail.com |    6789678945 | Hyderabad       | India           |      512345 |
