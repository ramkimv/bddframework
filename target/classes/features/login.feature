Feature: Facebook login

Scenario: Login page test scenario

Given user is on login page
When title of login page is Facebook
Then user enters username and password
Then user enters login button
And user is on home page