package  Day_003_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC04_linkText
{
	 WebDriver driver;
	
	 @Test
	  public void testTC02() throws Exception {
	
	    
		 	driver = new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			driver.get("https://www.amazon.in/");
			driver.findElement(By.linkText("Best Sellers")).click(); 
			
			
			driver.findElement(By.partialLinkText("Best Sell")).click(); 
			
			
			driver.findElement(By.partialLinkText("Inbox")).click(); 
			
			
			//findElement(By.linkText("Best Sellers")).click(); 
			//Tag must be like this <a >sddsdas</a>
			////To handle static(fixed)  hyper links,  linkText will be used
			 
	    
		 
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












