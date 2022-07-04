package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/DataDrivenTesting.feature", glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/Pagefactory.xml",
		         "json:target/JSONReports/Pagefactory.json",
		         "html:target/HtmlReports/Pagefactory.html"
		         }

)

public class PageFactoryRunner {

}
