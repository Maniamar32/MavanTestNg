package com.hyr.Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartXpaths {
	@Test
	public void Xpathsdata1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String loginwindow=driver.getWindowHandle();
		System.out.println(loginwindow);
		driver.switchTo().window(loginwindow);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		//driver.findElement(By.name("q")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//div[@class=\"eFQ30H\"]/following-sibling::div[5]")).click();
		driver.findElement(By.xpath("//div[text()=\"Home\"]//*")).click();
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
	
}
}