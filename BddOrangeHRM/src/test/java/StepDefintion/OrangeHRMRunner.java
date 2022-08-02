package StepDefintion;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Features/OrangeHRMProject.feature", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReport/hi.xml",
		         "json:target/JSONReport/hi.json",
		         "html:target/HtmlReports/hi.html"
		         }

)


public class OrangeHRMRunner {

}
