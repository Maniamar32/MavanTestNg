package SeleniumAlertsandPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Popupwindow {
	@Test
	public void init()  {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.get("https://ksrtc.in/oprs-web/");
	
	driver.findElement(By.xpath("//button[text()='Search for Bus']")).click();
     System.out.println("elemnt clicked");
	//Thread.sleep(5000);
	driver.switchTo().alert().accept();
	}

}
