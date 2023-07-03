Feature: EverNotes Feature
     Background:
         Given User is on the login page
  
     Scenario: Login with in-valid credentials
  
       When User enteres unregistered email and clicks continue
       Then User should see an error message "There is no account for the username or email you entered."
       
   	 Scenario: Login with valid credentials
  
       When User enteres registered email and clicks continue
  		 And 	User enteres valid password
  		 When User clicks on signin
       Then User can login and see the title

  	Scenario: User wants to write a note
	    Given user is logged in
	    When user clicks on new button
	    And user choose notes option
	    Then user should be able to take notes and save it
	    Then user should logout

	  Scenario: User wants to retrive the saved note
	    Given user is logged in
	    When user clicks on note which is already saved
	    Then user should be able to open the notes
