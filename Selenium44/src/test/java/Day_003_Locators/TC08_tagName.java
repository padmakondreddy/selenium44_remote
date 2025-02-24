package  Day_003_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC08_tagName
{
	static WebDriver driver;

	@Test
	public void Test2() throws Exception {
		
		
		 	driver = new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		List<WebElement> hyperlinks=  driver.findElements(By.tagName("a"));	
		
		int count=hyperlinks.size();
		System.out.println("Number of hyperlinks on the web page: "+count);
		
		
		
		
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











