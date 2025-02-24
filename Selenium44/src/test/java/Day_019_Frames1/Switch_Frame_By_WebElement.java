package Day_019_Frames1;

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



public class Switch_Frame_By_WebElement {
	
	//By Index  //driver.switchTo().frame(0); 	driver.switchTo().frame(1);
	//By Name or Id //	driver.switchTo().frame("iframe1");
	//By Web Element //driver.switchTo().frame("id of the element");
	

	
	static WebDriver driver;
	

	@Test
	public void Login_Test() throws Exception
	{
		
	
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize() ;
	driver.get("https://dzhxn2zqob34wazgtozeqg.on.drv.tw/www.bhavasri.com/Frames/AllContacts.html");
	//driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
	
	driver.switchTo().frame(findElement(By.id("GoogleContactForm")));
	findElement(By.name("firstname")).sendKeys("Selenium");
	findElement(By.name("lastname")).sendKeys("Sudhakar");
	findElement(By.name("subject1")).sendKeys("Selenium Sudhakar");
	driver.switchTo().defaultContent();
	
	
	
	driver.switchTo().frame(findElement(By.id("AmazonContactForm")));
	findElement(By.name("firstname")).sendKeys("Sunita");
	findElement(By.name("lastname")).sendKeys("TCS");
	findElement(By.name("subject")).sendKeys("Sunita TCS");
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
