package Day_020_Multiple_Windows1;

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
	
	// First I will store main window information in String Object Parent = driver.getWindowHandle(); 
	String parent=driver.getWindowHandle();  //naukri
	System.out.println("Main Window Title is :"+ driver.getTitle());//To Print current

	Thread.sleep(5000);
	WebElement Amazon=driver.findElement(By.xpath("(//a[text()='Amazon'])[1]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("arguments[0].click();", Amazon);
	
	//Once after multiple windows are opened ,We will write Set<String> set = driver.getWindowHandles();
	Set<String> set=driver.getWindowHandles();//Then set object contains multiple windows information 
	
	Iterator<String> I1= set.iterator(); 
	//Now I will iterate set(multiple windows) object information by using Iterator
	//Iterator<String> I1= set.iterator(); 
	// And I will write
	while(I1.hasNext()) //true,false
	{
		String child_window=I1.next();//To switch into Child window , we will write 
		
			if(!parent.equals(child_window)) // if parent window != child window
			{
				driver.switchTo().window(child_window);//Amazon
				System.out.println("Title is :"+ driver.getTitle());
				Thread.sleep(1000);
				driver.close();
			}
	}
	//To switch back to the parent window , We will write
	driver.switchTo().window(parent);
	

	
	
		
	}
	

}