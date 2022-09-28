package com.hyr.sridharClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendTextToAlertBox {
	
	@Test()
	
	public void SendUsername() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("SITE OPNED");
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
				
		
	}

}
