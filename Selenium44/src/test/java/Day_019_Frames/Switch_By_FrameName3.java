package Day_019_Frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



public class Switch_By_FrameName3 {
	
	//By Index  //driver.switchTo().frame(0); 	driver.switchTo().frame(1);
	//By Name or Id //	driver.switchTo().frame("iframe1");
	//By Web Element //driver.switchTo().frame("id of the element");
	
	static WebDriver driver;
	

	@Test
	public void Login_Test() throws Exception
	{
		
	
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	List<WebElement> frames=driver.findElements(By.tagName("frame"));
	System.out.println("Number of frames:"+frames.size());
	
	
	driver.switchTo().frame(frames.get(0)); //1st frame
	
	
	findElement(By.name("mytext1")).sendKeys("Selenium");
	driver.switchTo().defaultContent();

	
	driver.switchTo().frame(frames.get(1)); //2nd frame
	findElement(By.name("mytext2")).sendKeys("Sudhakar");
	driver.switchTo().defaultContent();
	
	
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
