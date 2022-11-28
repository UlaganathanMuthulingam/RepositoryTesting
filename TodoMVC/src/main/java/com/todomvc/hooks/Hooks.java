package com.todomvc.hooks;

import java.io.IOException;

import com.todomvc.commonfunction.ReusableFunction;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends ReusableFunction
{

	@Before
	public void beforeannotation(Scenario scenario)
	{
		
	}
	
	@After
	public void afterAnnotation(Scenario scenario) throws IOException
	{
			
	}
	
	@AfterStep
	public void beforestep(Scenario scenario) throws IOException
	{
		
	}
}
