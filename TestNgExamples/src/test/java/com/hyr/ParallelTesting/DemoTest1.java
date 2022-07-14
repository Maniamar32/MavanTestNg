package com.hyr.ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(TestListenerClass.class)
public class DemoTest1 {
	WebDriver driver=null;
	@Test
	
	public void testmethod1() {
	System.out.println("Demo1  >>  testmethod1 is  >>  "+Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	driver.quit();

	
	}
	
@Test
	
	public void testmethod2() {
		System.out.println("Demo1  >>  testmethod2 is  >>  "+Thread.currentThread().getId());
	
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
}
@Test

public void testmethod3() {
	System.out.println("Demo1  >>  testmethod3 is  >>  "+Thread.currentThread().getId());
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	driver.quit();
}




}
