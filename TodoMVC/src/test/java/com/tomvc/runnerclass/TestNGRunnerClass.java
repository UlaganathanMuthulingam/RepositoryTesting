package com.tomvc.runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/Featurefiles",
        glue = {"com.toddomvc.stepdefinition"},
        monochrome = true,
        dryRun=false)

public class TestNGRunnerClass extends AbstractTestNGCucumberTests{
	
}
