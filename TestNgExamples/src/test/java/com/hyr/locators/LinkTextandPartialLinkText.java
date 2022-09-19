package com.hyr.locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextandPartialLinkText {
   @Test
	public void LinkText() {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Today's")).click();
        
	   List<WebElement> l= driver.findElements(By.tagName("a"));
        System.out.println("list of links: "+ l.size());
        for(int i=0;i<=l.size();i++) {
        	System.out.println(l.get(i).getText());
        	System.out.println(l.get(i).getAttribute("href"));
        }
}
}
