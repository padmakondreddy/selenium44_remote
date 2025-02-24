package Day_020_Multiple_Windows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Open_New_Tab {
	
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("https://opensource-demo.orangehrmlive.com/");

	//below line opens new tab
	((JavascriptExecutor)driver).executeScript("window.open()");
	
	
	//store all the open windows in ArrayList string
	Set<String> Set=driver.getWindowHandles();
	ArrayList<String> tabs = new ArrayList<String>(Set);
	//tabs.get(0)---->Orange HRM
	//tabs.get(1)----> New Window
	
	//driver.switchTo().window()
	
	//Switch to New tab 	
	driver.switchTo().window(tabs.get(1)); //Jumping to New Window
	driver.get("http://google.com");
	
	
	
    Thread.sleep(5000);
	
	//back to MainWindow
	driver.switchTo().window(tabs.get(0)); //Jumping to Orange HRM

	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
		

	
	
		
	}
	

}