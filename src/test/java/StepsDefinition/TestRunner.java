package StepsDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/rasik/Guru99POM/src/test/feature/Login.feature",
glue="StepsDefinition",
monochrome= true,

plugin = { "pretty", "junit:target/cucumber-reports.xml" }
		)
//"pretty", "html:target/cucumber-reports"
//"pretty", "json:target/cucumber-reports.json"
public class TestRunner {
	
}
