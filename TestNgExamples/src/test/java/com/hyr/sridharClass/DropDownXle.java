package com.hyr.sridharClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownXle { 
	@Test
	
	public void MultipleSelect() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		WebElement l =driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Select  s=new Select(l);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(4)).click(s.getOptions().get(5)).click(s.getOptions().get(6)).build().perform();
		Thread.sleep(3000);
		s.deselectByIndex(4);
		
		
	}

}
