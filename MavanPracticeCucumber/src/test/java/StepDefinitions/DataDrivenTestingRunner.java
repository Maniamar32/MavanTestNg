package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/DataDrivenTesting.feature", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/POM.xml",
		         "json:target/JSONReports/POM.json",
		         "html:target/HtmlReports/POM.html"
		         }

)

public class DataDrivenTestingRunner {

}
