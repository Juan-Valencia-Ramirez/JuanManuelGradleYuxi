Feature: Test the search functionality on Google page

Scenario: validate search functionality

Given I am on the Google search page
When I search for a criteria
And I click on the search button
Then the result is displayed on screen
