package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOmayo {
	WebDriver driver;
	
	@Given("^I navigate to application URL$")
	public void  I_navigate_to_application_URL() {
		System.out.println("Step1:navigate page done");
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mania\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		System.out.println("omayo line excuted");
	}
	
	 @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	    public void i_enter_username_as_username_and_password_as_password_into_the_fields(String username, String password)  {
			
		 System.out.println("Step2:enter username and password");
         driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
		System.out.println("Step3: filled username and password");
    }
	
	@And("^I click on Login button$")
	    public void i_click_on_login_button()  {
		System.out.println("inside login method");
		 driver.findElement(By.xpath("//input[@type='button']")).click();
	    }
	 
	@Then("^User should be able to login based on \"([^\"]*)\" login status$")
	    public void user_should_be_able_to_login_based_on_login_status(String expected)  {
		System.out.println("Step4:loginstatus success");
		System.out.println("inside login status");
		Alert alert=  driver.switchTo().alert();
		String actualresult=null;
	 if(alert.getText().contains("loginfail"))
	 {
			  actualresult="failure";
	 }
	  Assert.assertEquals(expected,actualresult);
	    }

	}
	 

