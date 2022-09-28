package com.hyr.sridharClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm {
	@Test
	public void Registration() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Sunkishala");
		driver.findElement(By.name("vfb-7")).sendKeys("Nagamani");
		List<WebElement> l=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
        int radio=l.size();
        System.out.println(radio);
        for(int i=1;i<=radio;i++)
        {
        	if(i==1) {
        		l.get(i).click();
        	}
        	else {
        		l.get(i).click();

        	}
        }

		
		
		
		
	}

}
