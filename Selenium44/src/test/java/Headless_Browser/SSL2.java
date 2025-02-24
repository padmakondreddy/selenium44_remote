package Headless_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
//https://www.toolsqa.com/selenium-webdriver/ssl-certificate-in-selenium/
public class SSL2 {
	
	WebDriver driver;
	
	@Test
	public void LoginTest() throws Exception
	{
		
		
		ChromeOptions options = new ChromeOptions();

		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		options.setAcceptInsecureCerts(true);
				
		//Creating instance of Chrome driver by passing reference of ChromeOptions object
		 driver = new ChromeDriver(options);
		
		//Launching the URL
		driver.get("https://expired.badssl.com/");
		System.out.println("The page title is : " +driver.getTitle());
		//driver.quit();
		
	}

}
