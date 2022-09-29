package com.hyr.sridharClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class DragAndDrop {
	@Test
	public void SingleEx() throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
        WebElement we=driver.findElement(By.xpath("//span[@draggable=\"true\"]"));
        System.out.println("first Done");
        WebElement we1=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
        System.out.println("second Done");
        Actions aa=new Actions(driver);
        System.out.println("action Done");
        Thread.sleep(3000);
        aa.dragAndDrop(we, we1).build().perform();
        System.out.println("dragdrop Done");
        
        
        
        
		
		
	}
	

}
