package DataProviderExce;

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
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class TC01_Add_Jobs {
	
	
	WebDriver  driver;
	
	//1.copy and paste dataprovider syntax
	@DataProvider(name = "DP2")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://Users//USER//Desktop//Nationality.xlsx", "Sheet3");
		
		
		System.out.println(testObjArray.length);
		return (testObjArray);
	}

	
  @Test(dataProvider="DP2")
  public void JobsTest(String Browser,String Testurl,String Username,String Password,String Jobname,String Jobdesc,String Jobnote) throws Exception {
	  

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
			 driver.manage().window().maximize() ;		
		   }
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(Testurl);
		
		findElement(By.name("username")).sendKeys(Username);
		findElement(By.name("password")).sendKeys(Password);
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(Jobname);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(Jobdesc);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(Jobnote);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		
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
