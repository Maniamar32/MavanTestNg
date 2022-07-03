package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginDemo.feature", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/LoginDemo.xml",
		         "json:target/JSONReports/LoginDemo.json",
		         "html:target/HtmlReports/LoginDemo.html"
		         }

)

public class LoginDemoRunner {

}
