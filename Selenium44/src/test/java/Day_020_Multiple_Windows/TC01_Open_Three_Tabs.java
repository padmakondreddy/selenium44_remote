package Day_020_Multiple_Windows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Open_Three_Tabs {
	
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("https://opensource-demo.orangehrmlive.com/"); //Default Website (get(0))

	//below line opens new tab
	((JavascriptExecutor)driver).executeScript("window.open()");
	((JavascriptExecutor)driver).executeScript("window.open()");
	((JavascriptExecutor)driver).executeScript("window.open()");

	
	
	
	//strore all the open windows in ArrayList string
	//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	
	Set<String> Set=driver.getWindowHandles();
	ArrayList<String> tabs = new ArrayList<String>(Set);
	
	//Switch to New tab
	driver.switchTo().window(tabs.get(1));
	driver.get("http://google.com");
	
	
	driver.switchTo().window(tabs.get(2));
	driver.get("https://facebook.com");
	
	
	
	driver.switchTo().window(tabs.get(3));
	driver.get("https://Amazon.in");
	
	
	
	
	
	
	
	
	
	
		
	}
	

}
