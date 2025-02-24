package DataProvider33;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Add_Jobs {
	
	WebDriver driver;
	

	  @DataProvider(name = "TestData2")
		 public Object[] myDataProvider() {
		      
		     Object data[][]=  new Object[3][6];
		     // First set of Input data
		     data[0][0]= "https://opensource-demo.orangehrmlive.com/"; 
		     data[0][1]= "Admin";
		     data[0][2]= "admin123";
		     data[0][3]= "Sales53090";
		     data[0][4]= "Sales53090 descr";
		     data[0][5]= "Sales53090 Notes";
		      
		     // Second set of Input data
		     data[1][0]= "https://opensource-demo.orangehrmlive.com/"; 
		     data[1][1]= "Admin";
		     data[1][2]= "admin123";
		     data[0][3]= "Sales53091";
		     data[0][4]= "Sales53091 descr";
		     data[0][5]= "Sales53091 Notes";
		     
		     // Third set of Input data
		     data[2][0]= "https://opensource-demo.orangehrmlive.com/"; 
		     data[2][1]= "Admin";
		     data[2][2]= "admin123";
		     data[0][3]= "Sales53092";
		     data[0][4]= "Sales53092 descr";
		     data[0][5]= "Sales53092 Notes";
		     
		     return data;
		      
		      
		 }
	
	
	
	
  @Test
  public void SkilsTest() {
	  
	  //Launch Chrome browser
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Sales5309");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Sales5309 Descr");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("Sales5309 Notes");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		
		
		
		
		
		
  }
  
  
}
