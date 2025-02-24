package BaseProGrams;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills5 {
	
	WebDriver driver;
	
@Test
  public void Login() {
	  
	  //Launch Chrome browser

		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("file:///C:/Sudhakar_Secure/ASK%20ME.html");
		
	
  }
  
  
  
	
	public   void PhotoUpload()throws Exception
	{
		
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
		 
		      
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 Thread.sleep(1000);
		        

	       //  Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(1000);
	
		
	}
	
  
  
  
  
  
  
}
