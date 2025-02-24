package Day_017_Priorities_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Priority_Order {
	
	
	static WebDriver driver;
	//TC04_Login_NonStatic TN1;
	
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
	 
	
	
	
	@Test(priority=1)
	public  void Test1_OpenChromeBrowser()
	{
	
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	}


	@Test(priority=2)
	public  void Test2_OpenOrangeHRM() throws Exception
	{

		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		Thread.sleep(5000);
	}
	

	@Test(priority=3)
	public  void Test3_Login() throws Exception
	{
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.name("//button[@type='submit']")).click();
		
		
	}
	

	
	@Test(priority=4)
	public  void Test4_Addnatialities() throws Exception
	{
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//a[text()='Nationalities']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Indian30");
		findElement(By.xpath("//button[text()=' Save ']")).click();
		
	}
	
	
	
	
	
	
	@Test(priority=5)
	public   void Test5_Logout()throws Exception
	 {
		 findElement(By.id("welcome")).click();	 
		Thread.sleep(300);
		 findElement(By.linkText("Logout")).click();
		 
	 }
	
	
	@Test(priority=6)
	public   void Test6_closebrowser() throws Exception
	{
		 driver.quit();
	}
	

}
