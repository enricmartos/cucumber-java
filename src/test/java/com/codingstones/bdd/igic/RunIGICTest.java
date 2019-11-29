package com.codingstones.bdd.igic;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/igic/features" },
        features = "classpath:features/igic"
)
public class RunIGICTest {
}