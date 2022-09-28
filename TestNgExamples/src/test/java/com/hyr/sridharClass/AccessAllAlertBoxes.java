package com.hyr.sridharClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessAllAlertBoxes {
	@Test
	public void sendText() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("SITE OPNED");


		WebElement we=driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:green; border: 4px solid red;')",we);
		we.click();
		
		Alert a=driver.switchTo().alert();
		System.out.println("altertbox msg :"+a.getText());
		Thread.sleep(2000);
		a.sendKeys("Welcome to selenium");
		Thread.sleep(2000);	
		a.accept();
		Thread.sleep(2000);	

		WebElement we1=driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 4px solid blue;')",we1);
		we1.click();
		Thread.sleep(2000);	
		a.accept();
		
		WebElement we2=driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]"));
		js.executeScript("arguments[0].setAttribute('style', 'background:pink; border: 4px solid green;')",we2);
        we2.click();
		Thread.sleep(2000);	
	    a.accept();
		



	}

}
