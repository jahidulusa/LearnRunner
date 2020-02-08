@smoketest @regressiontest
Feature: Validate login function in PHP travels

Scenario: User able to login with valid credential
Given user go to login page
And user print the page title
When user enters a valid user name
And user enters a valid password
Then user click on the login button
And verify demo user page appear 
And user print the page title
When user click on log out button
And user print the page title
And user close the browser