package com.todomvc.commonfunction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableFunction {
	public WebDriver driver;
	public JavascriptExecutor js;

	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
		

	}

	public void browersetup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		setDriver(driver);
		this.driver=getDriver();
		
	}
	
	
	public void openBrowser(String url)
	{
	
	driver.get(url);
	driver.manage().window().maximize();
	}
	
	public void enterTxtAndPressEnter(WebElement element,String inputtext)
	{
		element.sendKeys(inputtext);
		element.sendKeys(Keys.ENTER);
	}
	
	public void closeTheBrowser()
	{
		driver.quit();
	}
	
}
