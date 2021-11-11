Feature: Converting E2E test case to Page Object Design Pattern
Scenario: Logging into toolsqa and testing tab functionality
	 Given user is on home page
	 When click on tutorials button
	 And  select the programming language tab
	 And  select the language and clcik on it which should navigate to language page
	 And verify all links  and click on any link
	 And User should naviagte to particlar link
	 
@First
Scenario: Testing hooks and tags
	 Given Write code for  tagOne
	 
@First @Second
Scenario:  Write code for  tagTwo
	 Given  Write code for  tagTwo
	@Second 
Scenario: Write code for  tagThree
	 Given Write code for  tagThree
@Second 	 
Scenario: Write code for  tagFour
	 Given Write code for  tagFour
	@Three 
Scenario: Write code for  tagFive
	 Given Write code for  tagFive
	@Three  
Scenario: Write code for  tagSix
	 Given Write code for  tagSix
	 	 
Scenario Outline: Enroll Yourself
	 Given user is on home page
	 When click on Enroll yourself button
	 And  Please enter firstname "<firstname>"
	 And  Please enter  lastname "<lastName>"
	 And  Please enter  emial "<email>"
	 And Please enter mobile "<mobile>"	
	 And Please enter country "<country>"	
	 And Please enter city "<city>"	
	 And Clcik on send button
	 
Examples:
	 
| firstname | lastName  | email | mobile  |country |city  |
|   shilpa  |   Redddy  | Shilpa.reddy@gmail.com |9742349188 |India |Banaglaore  |
|   dwaraka  |   Redddy  | dwaraka.reddy@gmail.com |9742349195 |Aruba |Kurnool  |


	 

	
	 
	 
	 
	 
	 
	 
	 
