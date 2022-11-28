#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Feature
Feature: TodoFunctionality Testcases
 This have few testcases for todo functionality
 
Background: Setup the chrome driver
	Given setup the chrome driver for mvc project
	


@EnterTodoTask 
Scenario: Enter the to do task
Given when I launch the URL "https://todomvc.com/examples/vue/"
When I enter the todo task one "Early morning cycling" and click on enter
When I enter the todo task two "Meeting at 9 am" and click on enter
When I enter the to do task three "Status meeting at 2.30 pm" and click on enter 
Then verify the Task added successfully
Then close the browser



@changeStatusAsDone
Scenario: Verify by selecting any task
Given when I launch the URL "https://todomvc.com/examples/vue/"
When I enter the todo task "TaskToChangeStatusAsDone" and click on enter
Then I select the radio button for "TaskToChangeStatusAsDone" task
Then the selected task to be completed

