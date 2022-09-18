package com.hyr.windowshandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowhndleHYR {
	@Test
	
	public void Gethandle1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String mainwidow=driver.getWindowHandle();
		System.out.println(mainwidow+""+driver.getTitle());
		
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> windows=driver.getWindowHandles();
       for(String twowindows:windows) {
    	    System.out.println(twowindows+""+driver.getTitle());
            if(!twowindows.equals(mainwidow)) {
         	   driver.switchTo().window(twowindows);
         	   driver.manage().window().maximize();
         	   driver.findElement(By.id("firstName")).sendKeys("Sunkishala nagmani");
                Thread.sleep(2000);
            }
       }
       driver.switchTo().window(mainwidow);
       driver.findElement(By.id("name")).sendKeys("amarenderraju");
	}

}
