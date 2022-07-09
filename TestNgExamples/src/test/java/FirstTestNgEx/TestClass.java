package FirstTestNgEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void InitialiseBrowser(String browserName) {
		switch(browserName){
		case "chrome":
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		break;
		
		default:
			System.err.println("Browser name is worng");
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
}
