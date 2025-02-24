package DataProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Add_Skills11 {
	
	WebDriver driver;
	
	//Step1
	@DataProvider(name="Test15")
    public Object[] dataprovider() {
   	
   	Object data[][]=new Object[3][6];
   	
	     // First set of Input data
	     data[0][0]= "Chrome"; 
	     data[0][1]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[0][2]= "Admin";
	     data[0][3]= "admin123";
	     data[0][4]= "Java1510";
	     data[0][5]= "Java1510Desc";
	  
	     
	     
	  // second set of Input data
	     data[1][0]= "Edge"; 
	     data[1][1]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[1][2]= "Admin";
	     data[1][3]= "admin123";
	     data[1][4]= "Java1610";
	     data[1][5]= "Java1610Desc";
	     
		  // second set of Input data
	     data[2][0]= "Edge"; 
	     data[2][1]= "https://opensource-demo.orangehrmlive.com/"; 
	     data[2][2]= "Admin";
	     data[2][3]= "admin123";
	     data[2][4]= "Java1611";
	     data[2][5]= "Java1611Desc";
	   
	     
	     return data;
 

   }		
	
	
	
	
	
	
  @Test(dataProvider="Test15")
  public void Skills(String Browser,String TestURL,String UserName,String PassWord
		  ,String SkillName,String SkillDescr) throws InterruptedException {
	  
	  //Launch Chrome browser
	  
	  if(Browser.equals("Edge"))
		driver =new EdgeDriver();
	  
	  if(Browser.equals("Chrome"))
			driver =new ChromeDriver();
	  
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(TestURL);
		
		driver.findElement(By.name("username")).sendKeys(UserName);

	
		driver.findElement(By.name("password")).sendKeys(PassWord);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
		
  }
  
  
  
  
}
