package  Day_032_TestNG_Groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;
public class AllTests
{
	
	
	@Test(groups = { "checkintest" })
	public void Test1() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = new ChromeDriver();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		
		driver.close();
	}
	
	
	@Test(groups = { "functest" })
	public void Test2() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = new ChromeDriver();
		
		//OpenUrl
		driver.get("http://newtours.demoaut.com/");

		
		//Close Browser		
		driver.close();
	}
	
	
	
	
	@Test(groups = { "functest","checkintest"})
	public void Test3() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = new ChromeDriver();
		
		//OpenUrl
		driver.get("https://www.google.co.in/?gws_rd=ssl");

		//SendKeys
	
		
		//Close Browser		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}                                                  












