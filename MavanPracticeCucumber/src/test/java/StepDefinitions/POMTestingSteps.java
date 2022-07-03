package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPages.POMLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMTestingSteps {
	WebDriver driver=null;
	POMLoginPage login;

	@Given("User is open google browser")
	public void user_is_open_google_browser() {
		System.out.println("  ==== POMTestingSteps =====");
		System.out.println("step1");    
		 System.setProperty("webdriver.chrome.driver", "D:/javaprograms/MavanPracticeCucumber/src/test/resources/drivers/chromedriver.exe");
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().window().maximize();
	}

	@Given("user is working on login page")
	public void user_is_working_on_login_page() {
	System.out.println("step2");    
	
	driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws Exception {
		System.out.println("step3"); 
		 login=new POMLoginPage(driver);
		login.EnterUserName(username);
		login.EnterPassword(password);
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		
	}

	@When("user clicked on login button")
	public void user_clicked_on_login_button() {
		System.out.println("step4");   
		login.ClickLogin();
		//driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("step5");   
		login.ClickLogout();
		//driver.findElement(By.id("pageLogin")).isDisplayed();
		//driver.getPageSource().contains("FREE SIGN UP");
		driver.close();
		driver.quit();
		
	}


}
