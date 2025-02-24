package Day_022_Action_class;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC04_Drag_And_Drop2 {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("http://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	 
	//*[@id="draggable"]/p  --- Source button
	//*[@id="droppable"] ---- Target Button
	
	
	// coming to Drag and drop operation
	
	// first , We have to create  web element object reference for
	// source button and target buttons . we have to write code as  
	
	WebElement Source_Button=driver.findElement(By.xpath("//*[@id='draggable']"));
	
	WebElement Target_Button=driver.findElement(By.xpath("//*[@id='droppable']"));
	
	// And we have to create an object for actions class , as
	Actions actions = new Actions(driver);
	
	// And we have to write 
	actions.dragAndDrop(Source_Button, Target_Button).perform();
	
	//so , source button will be dragged at target location

		
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
