package DataProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Add_Jobs3 {
	
	WebDriver  driver;
	
	//step1.Copy and paste dataprovider syntax
      
	@DataProvider(name="Test15")
    
     public Object[] dataprovider() {
    	
    	Object data[][]=new Object[2][7];
    	
	     // First set of Input data
	     data[0][0]= "Chrome"; 
	     data[0][1]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[0][2]= "Admin";
	     data[0][3]= "admin123";
	     data[0][4]= "Java15";
	     data[0][5]= "Java15Desc";
	     data[0][6]= "Java15Note";
	     
	     
	  // Third set of Input data
	     data[1][0]= "Edge"; 
	     data[1][1]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[1][2]= "Admin";
	     data[1][3]= "admin123";
	     data[1][4]= "Java16";
	     data[1][5]= "Java16Desc";
	     data[1][6]= "Java16Note";
	     
	     return data;
  

    }		
	
	
	
	
	@DataProvider(name="Test2")
	  public Object[][] TestDataProvider2() {
	    return new Object[][] {
	      new Object[] { "Edge","https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java100","Java 100 descr","Java 100 Note"  },
	      new Object[] { "Chrome","https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Java110","Java 110 descr","Java 110 Note"   },
	    };
	  }
	
	
	
	
	
	
	
	
	
	
    	
	//step2.CONNECT WITH Dataprovider
 
	@Test(dataProvider="Test2")

  public void JobsTest(String Browser,String Testurl,String Username,String Password,String JobName,String JobDesc,String JobNote) {
	  
		
		if(Browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		if(Browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
	
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(Testurl);
		
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobName);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDesc);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
