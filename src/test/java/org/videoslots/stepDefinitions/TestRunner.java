package org.videoslots.stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path of feature file
		features = "src/test/resources/Features/EverNotes.feature", glue = "/org/videoslots/stepDefinitions",plugin = { "json:target/cucumber.json" },
		monochrome = true
)
public class TestRunner {
}