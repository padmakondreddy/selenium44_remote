package  Day_003_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC05_partialLinkText
{
	static WebDriver driver;
	
	 @Test
	  public void testTC03()  {
		 
		  driver = new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			driver.get("https://www.amazon.in/");
			
			
			driver.findElement(By.partialLinkText("Best Sell")).click();  

			//findElement(By.partialLinkText("Inbox")).click(); 
			
			//Tag must be like this <a >Inbox (123) </a>
			//To handle dynamic hyper links,  partialLinkText will be used
		    
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












