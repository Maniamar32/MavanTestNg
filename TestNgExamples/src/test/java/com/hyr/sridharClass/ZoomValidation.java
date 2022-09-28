package com.hyr.sridharClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomValidation {
@Test

	public void getTextFromWebsite() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signup");
		  WebElement we=driver.findElement(By.xpath("//a[@class=\"link\"]"));
          we.click();
          System.out.println("signin");
         WebElement we1= driver.findElement(By.xpath("//div[@class=\"redirct-to-signup\"]"));
         we1.click();
          System.out.println("second signin"+we1.getText());
          
          WebElement we2=driver.findElement(By.xpath("//div[text()=\"Zoom is protected by reCAPTCHA and their \"]"));
          we2.click();
          System.out.println("third signin"+we2.getText());
         
         // driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sunkishala");
}

}
