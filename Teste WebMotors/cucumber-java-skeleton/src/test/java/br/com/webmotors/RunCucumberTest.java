package br.com.webmotors;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/jsonReports/cucumber.json"},
        features = "src/test/resources/features")
public class RunCucumberTest {

}
