package SeleniumAlertsandPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptAlertsSDEA {
	@Test
	public void init() throws Exception  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	// click ok button
	/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
     System.out.println("elemnt clivked");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	*/
	
	// click on cancel button
	/*
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
    System.out.println("elemnt clicked");
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();*/

	//send text to inputbox
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
    System.out.println("elemnt clicked");
	Thread.sleep(5000);
	Alert a=driver.switchTo().alert();
	System.out.println("msg displayed on alret  :" + a.getText());
	Thread.sleep(3000);
	a.sendKeys("hello");
	a.accept();
	
	Thread.sleep(3000);
	

	
	}

}
