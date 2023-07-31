Feature: Verify Error Msg

Background:
Given a user is on the landing page
And he click on sign-in button

@TC_002 @TC_003
Scenario: A user with invalid credentials must get an error message while logging in
And he enters invalid email address in the email text box
And he click on the continue button
Then he must see the error message - "We cannot find an account with that email address"


Scenario Outline: A user with multiple invalid credentials must get an error message while logging in
And he enters an invalid email address "<emailId>" in the email text-box
And he click on the continue button
Then he must see the error message - "We cannot find an account with that email address"
Examples:
|emailId|
|batman554466@gamil.com|
|superman554466@gamil.com|
|spiderman554466@gamil.com|
|ironman554466@gamil.com|
|captainplanet554466@gamil.com|