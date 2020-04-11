package com.poc.bdd.runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
                    glue = {"com.poc.bdd.steps"},
                    monochrome = true,
                    strict = true)
public class LoginRunner {
}
