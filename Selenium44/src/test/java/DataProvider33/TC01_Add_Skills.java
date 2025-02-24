package DataProvider33;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Add_Skills {
	
	WebDriver driver;
	
	
	//1.copy and paste dataprovider syntax
	
	@DataProvider(name="TestData1")
	  public  Object[][] getTestData()
	  {
		 Object[][] data=
		{
			{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle35","Oracle35 desc" },
	    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle45","Oracle45 desc"  },
	    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle55","Oracle55 desc"  },
	    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle65","Oracle65 desc"  },
	    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle75","Oracle75 desc"  },
	     };
		  return data;
	  }


	//2.connect with dataprovider
	
  @Test(dataProvider="TestData1")
  public void Login(String Testurl,String Username,String Password,String Skillrecord,String Skilldesc) {
	  
	  //Launch Chrome browser
	    
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		driver.get(Testurl);
		
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(Skillrecord);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(Skilldesc);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
		
  }
  
  
  
  
}
