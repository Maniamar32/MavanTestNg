package selenium.mavenJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookPage {
	@Test
	
	public void method1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mania\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
		String title=driver.getTitle();
		System.out.println("Title is---"+title);

}
}