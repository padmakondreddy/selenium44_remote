package Day011_Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC04_Thread_Sleep {
	
	WebDriver driver;
	
  @Test
  public void f( ) throws Exception {
	  
		 driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		  //Static Wait - fixed wait time
		  //Dynamic Waits- Implicit,Explicit,Fluent
		
		//Login
		  
		  Thread.sleep(4000);
		findElement(By.name("username")).sendKeys("Admin");
		
		  Thread.sleep(8000);  // static wait
		findElement(By.name("password")).sendKeys("admin123");
		
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
