#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Login Action

 Scenario: Successful Login with Valid Credentials
    
  Given Initialize the browser with Chrome
  When User enters "email" and "password" in both fields
	Then Clear the "email" and "password" fields
	When User enters "email" and "password" in both fields and clicks on signin button
  Then Display that user is successfully logged in
  And Navigate to "demo.guru99.com" site