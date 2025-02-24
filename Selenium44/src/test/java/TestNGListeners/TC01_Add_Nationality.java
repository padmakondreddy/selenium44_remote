package TestNGListeners;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Add_Nationality {
	
	WebDriver driver;
	
  @Test
  public void Nationality( ) throws Exception {
	  
			
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			

/*
DesiredCapabilities caps = DesiredCapabilities.
caps.setCapability("ignoreZoomSetting", true);
driver = new InternetExplorerDriver(caps);*/
		
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		//Login
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.xpath("//button[@type='submit']")).click();
		
		//AddNationality
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//a[text()='Nationalities']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Indian39");
		findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
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
