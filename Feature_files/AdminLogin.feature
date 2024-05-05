#Author: Taraka Rama Rao Inaganti.

@tag
Feature: Admin Login Page
  I want to check Admin Login with valid inputs

  @tag1
  Scenario: Check Admin Login with vlid inputs
    Given i open the broeser and url "https://orangehrm.qedgetech.com"
    Then  i should see login page
    When  i enter user name as "Admin"
    And   i enter password as "Qedge123!@#"
    And   i click login
    Then  i should see admin module
    When  i click logout
    Then  i see login page
    When  i close browser
    
    
	@tag2
	Scenario Outline: Check Admin login with invlaid inputs

		Given i open the broeser and url "http://orangehrm.qedgetech.com"
    Then  i should see login page
    When  i enter user name as "<username>"
    And   i enter password as "<password>"
    And   i click login
		Then  i sould see error message
		When  i close browser
Examples: 
      |username|password |
      | name1  | success |
      | name2  | Fail    |
      |        |success  | 
      |fail    |         |
      |        |         |
      

