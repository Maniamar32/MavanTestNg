package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPage {
	WebDriver driver;
	@FindBy(id="name")
	WebElement  txt_username;
	
	@FindBy(id="password")
	WebElement  txt_password;
	
	@FindBy(id="login")
	WebElement  btn_login;
	
	@FindBy(id="logout")
	WebElement  btn_logout;
	
		public PageFactoryLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}

	public void EnterUserName(String username) {
		 txt_username.sendKeys(username);
	}

	public void EnterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void ClickLogin() {
		btn_login .click();
	}
	public void ClickLogout() {
		btn_logout.isDisplayed();
	}
	public void LoginUserBalidation(String username,String password) throws Exception {
		//System.out.println("step3"); 
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		Thread.sleep(3000);
		
	}


}
