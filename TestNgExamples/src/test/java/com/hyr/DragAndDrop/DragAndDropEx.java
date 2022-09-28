package com.hyr.DragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropEx {
	@Test
public void dragAnddropdemo() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement we=driver.findElement(By.xpath("//div[@id='dropContent']/div[contains(., 'Oslo')]"));
		System.out.println("oslo");
		WebElement we1=driver.findElement(By.xpath("//div[@id='countries']/div[contains(., 'Italy')]"));
		System.out.println("Italy");
		//Actions 
		Actions a=new Actions(driver);
		System.out.println("Actions");
		a.dragAndDrop(we,we1).build().perform();

		//a.dragAndDrop(we,we1).build().perform();
		System.out.println("draganddrop");

		Thread.sleep(4000);
}
}
