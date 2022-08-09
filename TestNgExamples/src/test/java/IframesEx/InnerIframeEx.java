package IframesEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerIframeEx {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Frames.html");
driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
WebElement outIframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
driver.switchTo().frame(outIframe);
System.out.println("outframe excuted");
Thread.sleep(2000);
WebElement innerIframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
driver.switchTo().frame(innerIframe);
Thread.sleep(2000);

System.out.println("innerframe excuted");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
System.out.println("inputbox enterd");
	
	
	}

}
