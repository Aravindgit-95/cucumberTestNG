package com.testrunner;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= {"src\\test\\resources\\features"},glue= {"com.stepdefinition"})

public class TestRunnerClass extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	
	

	

}
