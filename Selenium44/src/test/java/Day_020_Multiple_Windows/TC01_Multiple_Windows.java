package Day_020_Multiple_Windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC01_Multiple_Windows {
	
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		

	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize() ;
	driver.get("https://naukri.com");
	
	String parent=driver.getWindowHandle();  //naukri

	Thread.sleep(5000);
	//driver.findElement(By.xpath("(//a[text()='Amazon'])[1]")).click();
	
	WebElement Amazon=driver.findElement(By.xpath("(//a[text()='Amazon'])[1]"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;	
	  js.executeScript("arguments[0].click();", Amazon);
	
	//store all the open windows in set object
	Set<String> tabs=driver.getWindowHandles();
	
	
	Iterator<String> I1= tabs.iterator();
	
	while(I1.hasNext()) //true,false
	{
		String child_window=I1.next();//Amazon
		
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);//Amazon
				
			//	driver.switchTo().defaultContent()
				
				System.out.println(driver.switchTo().window(child_window).getTitle());
				Thread.sleep(1000);
				
				
				
				
				driver.close();
			}
	}
	//switch to the parent window
	driver.switchTo().window(parent);
	

	
	
		
	}
	

}