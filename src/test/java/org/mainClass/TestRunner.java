package org.mainClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Createexcel.feature",
glue= {"org.mainClass"},
tags= {"@Search"},
dryRun=false,
monochrome=true,
plugin= {"html:target.html","json:target/reports.json"}
)
public class TestRunner {
	
}
