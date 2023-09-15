package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;



import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "Tests"
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}