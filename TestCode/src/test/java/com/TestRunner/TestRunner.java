package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\Mobile.feature",
glue={"com.StepDefinition", "com.hooks"},
plugin = {"json:target/cucumber.json"})
public class TestRunner {

}











