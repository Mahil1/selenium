package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant {
	
	public WebDriver driver;  //globally declare your webdriver
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/welcome/Desktop/SampleFramework.html");
	}
		
		@AfterMethod
		public void  closeApp()
		{	
         	//	driver.quit();		
		}
		
	}
	
	


