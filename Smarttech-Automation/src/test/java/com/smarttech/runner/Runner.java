package com.smarttech.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources", 
		glue = {"com.smarttech.stepdef"}, 
		tags = {"@smoketest"}, 
		plugin = { "pretty", "html:target/cucumber",
		"json:target/cucumber.json" }, 
		monochrome = true, 
		strict = true
		//dryRun=true
)
//extends AbstractTestNGCucumberTests
public class Runner {

}
