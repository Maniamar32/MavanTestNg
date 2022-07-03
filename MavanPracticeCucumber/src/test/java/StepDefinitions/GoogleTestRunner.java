package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/GoogleSearch.xml",
		         "json:target/JSONReports/GoogleSearch.json",
		         "html:target/HtmlReports/GoogleSearch.html"
		         }

)
public class GoogleTestRunner {

}
