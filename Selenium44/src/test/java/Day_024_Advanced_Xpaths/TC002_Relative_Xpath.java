package Day_024_Advanced_Xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC002_Relative_Xpath {
	
	WebDriver driver;
	
	
	
	@Test
	public void Test1()throws Exception
	{
		
		//*[@id="txtUsername"]//following::input[1]
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//*[@id="txtUsername"]
		
		//UserName
		findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		//Password
		findElement(By.xpath("//*[@id='txtPassword']"));
		
		//Login
		findElement(By.xpath("//*[@id='btnLogin']"));
			
		
	}
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
}
