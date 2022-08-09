package IframesEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleFrames {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview.summary.html");
		
		WebElement firstIframe=driver.findElement(By.xpath("//iframe[@src='overview-frame.html']"));
		driver.switchTo().frame(firstIframe);
		System.out.println("outframe excuted");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']"));
        driver.switchTo().defaultContent();
		System.out.println("go back to main page");

		Thread.sleep(2000);
		
		
		WebElement secondIframe=driver.findElement(By.xpath("//iframe[@src='allclasses-frame.html']"));
		driver.switchTo().frame(secondIframe);
		System.out.println("secondIframe excuted");

		driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
        driver.switchTo().defaultContent();
		System.out.println("go back to main page");

		Thread.sleep(2000);

	}

}
