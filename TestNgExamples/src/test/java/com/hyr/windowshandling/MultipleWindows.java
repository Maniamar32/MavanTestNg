package com.hyr.windowshandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
	
@Test
public void MultiWidows() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String mainwidow=driver.getWindowHandle();
	System.out.println(mainwidow+""+driver.getTitle());
	
    driver.findElement(By.id("newWindowBtn")).click();
    driver.findElement(By.id("newTabBtn")).click();
    driver.findElement(By.id("newWindowsBtn")).click();

    Set<String> windows=driver.getWindowHandles();
   for(String threewindows:windows) {
	    System.out.println(threewindows+""+driver.getTitle());
	    

   }
}

}
