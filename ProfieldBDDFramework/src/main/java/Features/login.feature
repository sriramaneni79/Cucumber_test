Feature: DEF login Feature
Scenario: DEF Login Test Scenario

Given user is already on Login Page
When title is login page of DEF
Then user enters username and password
Then user clicks on login button
Then user is on home page