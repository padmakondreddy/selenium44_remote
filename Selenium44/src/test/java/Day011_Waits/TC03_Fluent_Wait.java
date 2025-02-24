package Day011_Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC03_Fluent_Wait {
	
	WebDriver driver;
	
  @Test
  public void f( ) throws Exception {
	  
		 driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		  //Thread.sleep(5000);
      	 driver.findElement(By.name("username")).sendKeys("Admin");
      	 
      	// Thread.sleep(10000);
    	 driver.findElement(By.name("password")).sendKeys("admin123");
		  
		  
		  		   Wait<WebDriver> wait =
			        new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(20))
			            .pollingEvery(Duration.ofMillis(60))
			            .ignoring(NoSuchElementException.class);

			    wait.until(
			        elem -> {
			        	driver.findElement(By.name("username")).sendKeys("Admin");
			          return true;
			        });
			    
			    // if a Webelement is loading and displaying at different regular intervals , 
			    // We will use fluent wait

		
		
		
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
