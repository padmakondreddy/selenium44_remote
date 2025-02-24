package BrowserCompat;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Add_Skills {
	
	WebDriver driver;
	
	
	@Parameters({"Browser1","Testurl1","username1","password1","skillname1","skilldesc1"})
  @Test
  public void Login(String Browser,String Testurl,String username,String password,String skillname,String skilldesc) throws InterruptedException {
	  

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
	  


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get(Testurl);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(skillname);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(skilldesc);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
		
  }
  
  
  
  
}
