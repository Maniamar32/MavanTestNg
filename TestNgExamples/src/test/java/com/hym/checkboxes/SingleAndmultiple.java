package com.hym.checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleAndmultiple {
	@Test
	public void checkboxes() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//driver.findElement(By.id("monday")).click();
		List<WebElement> l=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id ,\"day\")]"));
		System.out.println(l.size());
		/*for(WebElement checkboxes:l) {
			checkboxes.click(); //all
		}*/
		 
		int checkboxes=l.size();
		/*for(int i=checkboxes-2;i<checkboxes;i++) {
			l.get(i).click();//last two
		}*/
		for(int i=0;i<checkboxes;i++) {
		   if(i<2) {
				l.get(i).click();//first two
 
		   }
		}
		
	}

}
