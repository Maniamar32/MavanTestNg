package StepDefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {
	WebDriver driver;
	@Given("user connect the browser")
	public void user_connect_the_browser() {
		System.out.println("step1");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user on OrangeHRM login page")
	public void user_on_orange_hrm_login_page() {
		System.out.println("step2");
	driver.get("https://opensource-demo.orangehrmlive.com/");    	
	
	}

	@Then("^enter (.*) and (.*)$")
	public void enter_username_and_password(String username,String password) throws Exception {
		System.out.println("step3");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);

	    }

	@Then("click the enter Login button")
	public void click_the_enter_login_button() {
		System.out.println("step4");
	    driver.findElement(By.id("btnLogin")).click();
	    }

	@Then("user into welcome page")
	public void user_into_welcome_page() {
		System.out.println("step5");
		System.out.println(driver.findElement(By.id("welcome")).isDisplayed());
		//driver.quit();
	    }



}
