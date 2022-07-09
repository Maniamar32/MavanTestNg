package com.hyr.Dataproviderprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDataProvider {
	WebDriver driver;
	@Test(dataProvider="Logindetails")

	public void LoginTest(String username,String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();


	}




	@DataProvider(name="Logindetails")
	public Object[][] Logindata() {
		Object[][] data=new Object[][] {
			{"Admin","admin123"},
			{"admin","Admin"},
			{"Admin","Admin123"}
		};
		return data;
	}
}
