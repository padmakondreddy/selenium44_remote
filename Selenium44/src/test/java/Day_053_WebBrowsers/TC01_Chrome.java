package Day_053_WebBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TC01_Chrome {
	
WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			
	
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				
			

		}
	

}
