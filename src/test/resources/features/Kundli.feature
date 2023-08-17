Feature: Create Kundli

  
    #Background: user Login
    #Given verify user enters on sign in button
    #When mobile number is enters "8826393418"
    #And clicks on submit button
    #And clicks on verify OTP button
    #Then Verify user Logined Successfully
    
    @Sanity
    Scenario Outline: User want to create Kundli
    Given Verify user on Kundli Page
    And Verify user add name 0
    When Verify user select Gender
    And Verify user select Date of birth
    Then Verify user select birth time
    And Verify user birth place 0
    Then Verify user click on Get your Kundli

     @negative
    Scenario:  User want to create Kundli with invalid birth place
    Given Verify user on Kundli Page
    And Verify user add name 1
    When Verify user select Gender
    And Verify user select Date of birth
    Then Verify user select birth time
    And Verify user birth place 1
    Then Verify user click on Get your Kundli
    And verify user get error message
    