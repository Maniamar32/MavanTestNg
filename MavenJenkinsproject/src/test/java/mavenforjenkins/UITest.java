package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {
	@Test
	public void startBrowser()
   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mania\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getTitle().contains("orange"),"title does not match");
		driver.quit();
	}
}
