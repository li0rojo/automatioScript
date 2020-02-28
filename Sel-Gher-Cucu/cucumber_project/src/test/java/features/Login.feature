Feature: login in OpenAir login and logoff

Background:
    Given I have open the browser
     Then Insert "Company ID", "User Id", and "Password"
    
@scenario1 @loginSucesfull 
Scenario: Login succesfull 
      And Click in login button 
      Then Close browser
     
@scenario2 @loginErrorID
  Scenario: Login problem
      And Verify Message Rejected   
      And Click in logIn button 
     Then Close browser 
     
     Examples:
     | Company ID | User Id      | Password     | 
     | 4th Source | RLizardo     |              |
     | 4th Soruce | li0rojo      | 11220033     |
     |Aguilethout | RSilva       | 11xxm033     |