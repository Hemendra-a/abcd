Feature: Login

  
  Scenario: user Login
    Given verify user enters on sign in button
    When mobile number is enters "8826393418"
    And clicks on submit button
    And clicks on verify OTP button
    Then Verify user 
   