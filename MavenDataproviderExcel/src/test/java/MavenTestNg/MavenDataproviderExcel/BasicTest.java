package MavenTestNg.MavenDataproviderExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTest {
	@Test(dataProvider="logindata",dataProviderClass = ExcelDataSupllier.class)
	public void TestLogin(String username,String password) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mania\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
	WebDriver driver=null;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
	String title=driver.getTitle();
	System.out.println("Title is---"+title);
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	System.out.println("username entered");
  Thread.sleep(1000);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	System.out.println("password entered");
	Thread.sleep(1000);

	driver.findElement(By.id("btnLogin")).click();
	System.out.println("login successfully");

}
}