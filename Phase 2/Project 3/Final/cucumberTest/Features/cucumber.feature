Feature: Test Cucumber Project

Scenario: a user must be able to go to sign in page
Given a user is in the LandingPage on amazon
When he type search-item in the search box and then select 3rd option from the drop-down
And select rating 4star and above from left side bar
And Click on the first search result
And Click Add to Cart button
And Verify the text Added to Cart is displayed
And Click on Proceed to Buy button
Then Verify user is on the Sign in page