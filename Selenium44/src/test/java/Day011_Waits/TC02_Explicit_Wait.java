package Day011_Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC02_Explicit_Wait {
	
	WebDriver driver;
	
  @Test
  public void f( ) throws Exception {
	  
		 driver=new ChromeDriver();
		 driver.manage().window().maximize() ;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		  
		    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    wait.until(elem -> driver.findElement(By.name("username")).isDisplayed());
		    
			driver.findElement(By.name("username")).sendKeys("Admin");
		    // if a Webelement is loading beyond default implicit time ,  
		    //We have to give extra time to handle that specific webelement , We will use Explicit  wait
		 
			
			  Wait<WebDriver> wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
			  wait1.until(elem -> driver.findElement(By.name("password")).isDisplayed());
			
			  driver.findElement(By.name("password")).sendKeys("admin123");
		
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
