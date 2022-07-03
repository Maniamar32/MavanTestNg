package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMLoginPage {
WebDriver driver;
By txt_username=By.id("name");
By txt_password=By.id("password");
By btn_login =By.id("login");
By btn_logout=By.id("logout");

public POMLoginPage(WebDriver driver) {
	this.driver=driver;
}

public void EnterUserName(String username) {
	driver.findElement( txt_username).sendKeys(username);
}

public void EnterPassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
}

public void ClickLogin() {
	driver.findElement(btn_login ).click();
}
public void ClickLogout() {
	driver.findElement(btn_logout).isDisplayed();
}
public void LoginUserBalidation(String username,String password) throws Exception {
	//System.out.println("step3"); 
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);
	Thread.sleep(3000);
	
}


}
