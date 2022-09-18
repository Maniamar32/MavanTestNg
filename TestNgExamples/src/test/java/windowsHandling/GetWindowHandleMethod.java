package windowsHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GetWindowHandleMethod {
	
	@Test
	
	public void Gethandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		//driver.findElement(By.className("btn btn-info")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		System.out.println(driver.getTitle());
		Set<String> s=driver.getWindowHandles();
		for(String i:s) {
			System.out.println(i);
			String s1=driver.switchTo().window(i).getTitle();
			System.out.println(s1);
			if(s1.contains("Selenium"))
				driver.close();
			//driver.findElement(By.xpath("//a[@class='nav-link']")).click();
			
		}

	}

}
