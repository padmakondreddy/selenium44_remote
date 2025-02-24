package Day_020_Multiple_Windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC03_Multiple_Windows {
	
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//switch to the parent window
	((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com/')");
	
	// It will return the parent window name as a String
	String parent=driver.getWindowHandle(); //parent="Orane HRM";

	//switch to the parent window
	driver.switchTo().window(parent);  //back to Orange HRM Website
	
	//System.out.println(driver.getTitle());
	
	
	Set<String> set=driver.getWindowHandles(); //set={OrangeHRM,Google}
	// Now iterate using Iterator
	Iterator<String> I1= set.iterator();

	while(I1.hasNext()) //True,False
	{

		String child_window=I1.next(); //child_window=Google


		if(!parent.equals(child_window))  //Orange HRM!=Google
		{
			driver.switchTo().window(child_window); //driver jumped to Google Page
			
			driver.findElement(By.xpath("((//*[@aria-label='Google Search'])[2])//preceding::textarea")).sendKeys("google");
			
			//driver.findElement(By.xpath("((//*[@aria-label='Google Search'])[2])")).click();
			
			Thread.sleep(6000);
	
			driver.close();
		}

	}//ends while loop

	
	driver.switchTo().window(parent);

	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
		

	
	
		
	}
	

}