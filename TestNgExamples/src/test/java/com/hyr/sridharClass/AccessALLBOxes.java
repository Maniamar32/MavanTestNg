package com.hyr.sridharClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessALLBOxes {

	@Test

	public void Access() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		JavascriptExecutor js=(JavascriptExecutor)driver;

		
		WebElement we=driver.findElement(By.name("alertbox"));
       js.executeScript("arguments[0].setAttribute('style' ,'background:green; border:4px solid red;')", we);
		we.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();

		WebElement we1=driver.findElement(By.name("confirmalertbox"));
		js.executeScript("arguments[0].setAttribute('style' ,'background:yellow; border:4px solid blue;')", we1);
		we1.click();
		System.out.println(a.getText());
		//Thread.sleep(2000);
		a.dismiss();
		
		WebElement we2=driver.findElement(By.xpath("//button[text()=\"Prompt Alert Box\"]"));
		js.executeScript("arguments[0].setAttribute('style' ,'background:red; border:4px solid yellow;')", we2);
		we2.click();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.sendKeys("yes welcome to selenium");
		//Thread.sleep(2000);

		  a.accept();
		
		



	}

}
