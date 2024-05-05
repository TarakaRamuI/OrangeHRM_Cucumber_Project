#Author: your.email@your.domain.com

Feature: Registration Page


Scenario: Check registration functionality with valid inputs

Given I open the browser with url "http://flights.qedgetech.com/register.html"
Then  I should see registration page
When  I enter the data
|Ramu|
|9645345678 |
|tarakmiracle@gmail.com|
|demo|
|09-11-2001|
And  I click the Register button
Then I sould see login page
When I close browser

#Feature: Login Page

Scenario: Check Login functionality

Given I open the browser with url "http://flights.qedgetech.com/login.html"
Then I sould see login page
When  I login into the appliction with "sureshbabu.qedge@gmail.com" and "demo"
Then  I should see home page
When  I click logout button
Then  I sould see login page
When I close browser

Scenario Outline: 
			Given I open the browser with url "http://flights.qedgetech.com/login.html"
			Then I sould see login page
			When  I login into the appliction with "<Username>" and "<Password>"
			Then  I should see home page
			When I close browser
Examples: 
     
     | Username	  | Password	|
     | asdfbgd@123| fwegjnfdg |
     | abc@bca    |xyzmms     |
     | zyz@zzx    | frgsdf    |
     
