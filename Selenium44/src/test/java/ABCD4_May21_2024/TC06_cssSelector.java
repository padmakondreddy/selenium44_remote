package  ABCD4_May21_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC06_cssSelector
{
	static WebDriver driver;

	@Test
	public void Test2() throws Exception {
	
	
		 driver = new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		
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











