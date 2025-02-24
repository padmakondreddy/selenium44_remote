package Day01_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC01_AddJobs1 {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	    driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Amazon.in");
		
		//findElement(By.name("//span[text()='Hello, sign in']")).click();
		//findElement(By.name("//span[text()='Your Account']")).click();
		
	
		WebElement Hello_Signin=findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement Your_Account=findElement(By.xpath("//span[text()='Your Account']"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(Hello_Signin).moveToElement(Your_Account).
		click().build().perform();
	
		
  }
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by); 
		Thread.sleep(500);
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
}
