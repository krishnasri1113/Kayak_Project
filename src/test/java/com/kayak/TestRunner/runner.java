package com.kayak.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\siri\\eclipse-workspace\\Kayak_Cucumber\\src\\main\\java\\com\\kayak\\features",
glue= {"helpers","com.kayak.stepDefinitionFile"},
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"})
public class runner {
	

}
