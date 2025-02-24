package Day_020_Multiple_Windows1;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC01_Multiple_Windows2 {
	
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		

		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize() ;
		driver.get("https://naukri.com");



	Thread.sleep(5000);

	
	WebElement Amazon=driver.findElement(By.xpath("(//a[text()='Amazon'])[1]"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;	
	  js.executeScript("arguments[0].click();", Amazon);
	  
	//To store all the open windows information in ArrayList Object
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	

	//tabs={"naukri","Amazon"}
	
	//Switch to New tab 	
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(3000);
	System.out.println(driver.getTitle());  //Amazon
	System.out.println(driver.getCurrentUrl());
	findElement(By.xpath("(//span[text()=' read more'])[2]"));
	

	Thread.sleep(2000);
	
	//back to MainWindow
	driver.switchTo().window(tabs.get(0));
	System.out.println("_______________________");
	System.out.println(driver.getTitle()); //back to naukri
	System.out.println(driver.getCurrentUrl());
	


	
		
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