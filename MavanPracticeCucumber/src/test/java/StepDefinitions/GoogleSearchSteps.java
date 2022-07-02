package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class GoogleSearchSteps {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("step1");
	    System.setProperty("webdriver.chrome.driver", "D:/javaprograms/MavanPracticeCucumber/src/test/resources/drivers/chromedriver.exe");
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("step2");
		driver.get("https://www.google.com/");
	}

@When("user enter  a text in searchbox")
public void user_enter_a_text_in_searchbox() {
	System.out.println("step3");
	driver.findElement(By.name("q")).sendKeys("automation step by step");

}

	@And("click enter")
	public void click_enter() {
		System.out.println("step4");  
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("step5");  

	driver.getPageSource().contains("Online Courses");	
	driver.close();
	driver.quit();
	}


}
