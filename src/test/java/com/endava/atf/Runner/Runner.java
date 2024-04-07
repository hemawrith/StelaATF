package com.endava.atf.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.endava.atf.RestSteps"},
        features = {"src/test/resources/features"},
        tags = "not @Bug or not @ManualOnly",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class Runner {
}
