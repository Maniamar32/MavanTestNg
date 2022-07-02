package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  System.out.println("Given Login");
	}

	@When("user enters username ans password")
	public void user_enters_username_ans_password() {
		System.out.println("username and passwrd");  
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Login click");
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
		System.out.println("navigate to home page");
	}


}
