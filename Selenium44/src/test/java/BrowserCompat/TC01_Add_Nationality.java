package BrowserCompat;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Add_Nationality {
	
	WebDriver driver;
	
	
	@Parameters({"Browser","Testurl","username","password","Nationality"})
  @Test
  public void f(String Browser1,String Testurl1,String username1,String password1,String Nationality1 ) throws Exception {
	  
		if(Browser1.equals("Chrome"))
		   {
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
		   }
			 
		
			 if(Browser1.equals("Firefox"))
			   { 
				 driver = new FirefoxDriver();
				 Thread.sleep(6000);
				 driver.manage().window().maximize() ;		
			   }
			
			 if(Browser1.equals("Edge"))
			   { 
				 driver = new EdgeDriver();
				 Thread.sleep(6000);
				 driver.manage().window().maximize() ;		
			   }
	  


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		  driver.get(Testurl1);
		
		
		
		//Login
		findElement(By.name("username")).sendKeys(username1);
		findElement(By.name("password")).sendKeys(password1);
		findElement(By.xpath("//button[@type='submit']")).click();
		
		//AddNationality
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//a[text()='Nationalities']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Nationality1);
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
