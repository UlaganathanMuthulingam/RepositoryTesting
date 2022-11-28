package com.todomvc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.todomvc.commonfunction.ReusableFunction;

public class TodoMVCPage extends ReusableFunction{

	public WebDriver driver;
	public JavascriptExecutor js;

	
	@FindBy(xpath="//*[@placeholder='What needs to be done?']")
	WebElement todotxt;
	
	WebElement addedtask;
	
	@FindBy(xpath="//*[@class='todo']")
	WebElement todotask;
	
	public TodoMVCPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterTodo(String todoValue)
	{
		enterTxtAndPressEnter(todotxt, todoValue);
		//verifyaddedtask(todoValue);
		
	}

	public void highlightElement(WebElement element)
	{
		js = (JavascriptExecutor)this.driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid green;');", element);
	}

	
	public void verifyaddedtask(String taskname)
	{
		String xpathfortask="//*[@type='checkbox']//following::label[text()='"+taskname+"']";
		addedtask=driver.findElement(By.xpath(xpathfortask));
		highlightElement(addedtask);
	}
	
	public void markstatus

}
