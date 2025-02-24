package DataProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Add_Skills {
	
	WebDriver driver;
	
	
	@DataProvider(name="Test1")
	  public  Object[][] getTestData()
	  {
		 Object[][] data=
		{
			{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle31","Oracle31 desc" },
	    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle41","Oracle41 desc"  },
	    	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Oracle51","Oracle51 desc"  },
	    	
	     };
		  return data;
	  }
	
	
	
	
  @Test(dataProvider="Test1")
  public void SkillTest(String Testurl,String Username,String Password,String SkillName,String SkillDesc) {
	  

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
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDesc);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
		
  }
  
  
  
  
}
