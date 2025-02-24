package DataProviderexcel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class TC01_Add_Skills2 {
	
	WebDriver driver;
	
	//1.copy and paste dataprovider syntax
			@DataProvider(name = "TestData4")
			public static Object[][] Authentication1() throws Exception {
				
				ExcelApiTest4 eat = new ExcelApiTest4();
				Object[][] testObjArray = eat.getTableArray("C://Users//USER//Desktop//TestData1.xlsx", "Sheet4");
				
				
				System.out.println(testObjArray.length);
				return (testObjArray);
			}
			
	
		
	
  @Test(dataProvider="TestData4")
  public void Login(String Browser,String Testurl,String Username,String Password,String Skillname,String Skilldesc) throws InterruptedException {
	  
	  //Launch Chrome browser
	  
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
		
		
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(Skillname);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(Skilldesc);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
		
  }
}
  
  
  

