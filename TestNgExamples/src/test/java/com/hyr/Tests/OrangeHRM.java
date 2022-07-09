package com.hyr.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
WebDriver driver;

@Parameters("browserName")
@Test

public void IntialiseBrowser(String browserName) {
	switch(browserName) {
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
  default:
	  System.err.println("browsername is invalid");
	  break;
	
	
	}
	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
}
@Parameters("url")
@Test

public void LaunchUrl(String url) throws Exception {
	driver.get(url);
    Thread.sleep(3000);
}

@Parameters({"userName","passWord"})
@Test

public void EnterCredintials(String userName,String passWord) throws Exception {
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	Thread.sleep(3000);
	driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	Thread.sleep(3000);

	driver.findElement(By.id("btnLogin")).click();
	}
@Test

public void ValidateLogin() {
System.out.println(driver.findElement(By.id("welcome")).isDisplayed());	
System.out.println("user login successfull");
}

@Test

public void NavigateToAdmin() throws Exception {
	Actions actions=new Actions(driver);
	actions
	.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
	.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
	.moveToElement(driver.findElement(By.id("menu_admin_viewLocations")))
	.click()
	.perform();
	Thread.sleep(3000);
	driver.findElement(By.id("searchLocation_name")).sendKeys("Hyderbad");
	actions.doubleClick(driver.findElement(By.id("btnSearch"))).perform();
	
	
	
}
@Test

public void Teardown() {
	driver.quit();
}

}
