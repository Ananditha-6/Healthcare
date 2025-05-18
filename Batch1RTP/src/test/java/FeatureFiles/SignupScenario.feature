Feature: Validate Signup Functionality of  Growtechminds Banking Application
@test1
  Scenario Outline: Validate Signup functionality
    Given user open the url of banking application
    And user clicks on the signup button in webpage
    And user enters the firstname as "<firstname>"
    And user enters the lasttname as "<lastname>"
    And user enters the phonenumber as "<phonenumber>"
    And user enters the dateofbirth as "<DOB>"
    And user selects the gender
    And user enters the cityname as "<city>"
    And user enters the userid as "<uid>"
    And user enters the password as "<password>"
    When user clicks on submit button
    Then validate that user is getting proper response from site
    And also verify that the title of the page is showing correct value

    Examples: 
      | firstname | lastname | phonenumber | DOB        | city      | uid    | password  |
      | rohan     | nair     |   587799090 | 02-03-2002 | hyderabad | 137840 | Test@123 |
