package  DAY045_CSS_Selectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC01_ID
{
	static WebDriver driver;

	@Test
	public void Test2() throws Exception {
	
		driver =new ChromeDriver();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
		//css=<HTML tag><#><Value of ID attribute>
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		findElement(By.cssSelector("input#username")).sendKeys("Admin");
		findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		findElement(By.cssSelector("button.orangehrm-login-button")).click();
		
		
		//tagName#id
		//tagName[attribute='value']
		//tagName.className
		
		
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











