package com.hyr.invocationCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount {
	WebDriver driver;
	@Test(invocationCount=3)

	public void TestMethod1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("UserName :"+driver.findElement(By.id("user_photo")));
	}

}
