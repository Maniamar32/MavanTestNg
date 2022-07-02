package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM{
	WebDriver driver=null;

	@Test

	public void LaunchBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	@Test

	public void Login() throws Exception {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		}
	@Test
	
	public void navigateToMyinfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	public void verifyMyInfo() {
		driver.findElement(By.id("employee-details")).isDisplayed();
		driver.quit();
	}
	@Test
	
	public void verifyLogin() {
		WebElement we=driver.findElement(By.id("welcome"));
		System.out.println(we.isDisplayed());
		System.out.println(we.getText());
		driver.quit();
	}
}
