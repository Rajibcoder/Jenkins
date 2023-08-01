package com.swiggy.Teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.swiggy.Teststeps"
		)
public class TestRunnerTest extends AbstractTestNGCucumberTests{

}
