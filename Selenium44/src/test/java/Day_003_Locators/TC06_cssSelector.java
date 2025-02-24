package  Day_003_Locators;

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
	
	public static final String usernamecss="input[placeholder='Username']";
	public static final String password_css="input[type='password']";
	

	@Test
	public void Test2() throws Exception {
	
	
		 driver = new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector(usernamecss)).sendKeys("Admin");
		driver.findElement(By.cssSelector(password_css)).sendKeys("admin123");
		
		
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











