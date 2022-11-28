package com.toddomvc.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.todomvc.commonfunction.ReusableFunction;
import com.todomvc.pages.TodoMVCPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Stepdef extends ReusableFunction{
	TodoMVCPage page;
	public WebDriver driver;
	
	@Given("setup the chrome driver for mvc project")
	public void browsersetup()
	{
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		setDriver(driver);
		*/
		browersetup();
		page=new TodoMVCPage(getDriver());
	}
	
	@Given("when I launch the URL {string}")
	public void when_i_launch_the_url(String website) {
	 openBrowser(website);
	 

	}
	@When("I enter the todo task one {string} and click on enter")
	public void i_enter_the_todo_task_one_and_click_on_enter(String taskvalue) {
		page.enterTodo(taskvalue);
		page.verifyaddedtask(taskvalue);
	}
	@When("I enter the todo task two {string} and click on enter")
	public void i_enter_the_todo_task_two_and_click_on_enter(String taskvalue) {
		page.enterTodo(taskvalue);
		page.verifyaddedtask(taskvalue);
	}
	@When("I enter the to do task three {string} and click on enter")
	public void i_enter_the_to_do_task_three_and_click_on_enter(String taskvalue) {
		page.enterTodo(taskvalue);
		page.verifyaddedtask(taskvalue);
	}
	@Then("verify the Task added successfully")
	public void verify_the_task_added_successfully() {
	}
	
	@Then("close the browser")
	public void closeBrowser()
	{
		closeTheBrowser();
	}
	
	@When("I enter the todo task {string} and click on enter")
	public void i_enter_the_todo_task_and_click_on_enter(String taskname) {
		page.enterTodo(taskname);
	}
	@Then("I select the radio button for {string} task")
	public void i_select_the_radio_button(String taskname) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("the selected task to be completed")
	public void the_selected_task_to_be_completed() {
	    // Write code here that turns the phrase above into concrete actions

	}



}
