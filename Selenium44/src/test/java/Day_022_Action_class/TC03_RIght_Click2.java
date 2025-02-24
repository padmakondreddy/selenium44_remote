package Day_022_Action_class;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC03_RIght_Click2 {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		

	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// coming to Right click operation on a web element
	
	// first , We have to create  web element object reference as
	WebElement Element=driver.findElement(By.xpath(""));
	
	// And we have to create an object for actions class , as
	Actions actions = new Actions(driver);
	
	// And we have to write 
	actions.contextClick(Web Element Object Reference).perform();
	
	
	
	//findElement(By.xpath("//span[text()='Quit']")).click();
	
    //Alert alert = driver.switchTo().alert();
    
   // Thread.sleep(1000);
    
    //alert.accept();
   // alert.dismiss();
		
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
