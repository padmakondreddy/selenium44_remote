package DataProviderexcel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class TC01_Add_Nationality2 {
	
	WebDriver driver;
	
	//1.copy and paste dataprovider syntax
		@DataProvider(name = "TestData3")
		public static Object[][] Authentication1() throws Exception {
			
			ExcelApiTest4 eat = new ExcelApiTest4();
			Object[][] testObjArray = eat.getTableArray("C://Users//USER//Desktop//TestData1.xlsx", "Sheet3");
			
			
			System.out.println(testObjArray.length);
			return (testObjArray);
		}
		
	
	
	
	//2.connect with @test
  @Test(dataProvider="TestData3")
  
  public void f(String Browser,String Testurl,String Username,String Password,String Nationalitytext ) throws Exception {
	  
	  if(Browser.equals("Chrome"))
	   {
	  
		
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	   }
	
	 if(Browser.equals("Firefox"))
	   {
	  
		
		 driver = new FirefoxDriver();
		
		 Thread.sleep(6000);
		 driver.manage().window().maximize() ;		
	   }

	 if(Browser.equals("Edge"))
	   {
	  
		 
		 driver = new EdgeDriver();
		
		 Thread.sleep(6000);
		 
		 } 
			driver.manage().window().maximize() ;	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		  driver.get(Testurl);
		
		
		
		//Login
		findElement(By.name("username")).sendKeys(Username);
		findElement(By.name("password")).sendKeys(Password);
		findElement(By.xpath("//button[@type='submit']")).click();
		
		//AddNationality
		findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		findElement(By.xpath("//a[text()='Nationalities']")).click();
		findElement(By.xpath("//button[text()=' Add ']")).click();
		
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Nationalitytext);
		findElement(By.xpath("//button[text()=' Save ']")).click();
		driver.close();
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
