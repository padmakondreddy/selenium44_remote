package Headless_Browser;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IncognitioMode {
	
	WebDriver driver;
	
	@Test
	public void LoginTest() throws Exception
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		driver=new ChromeDriver(options);
		driver.get("https://Amazon.in");
		
		
	
		//https://www.guru99.com/chrome-options-desiredcapabilities.html
		
		
		
		
		//driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Login
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 
		
	}

}
