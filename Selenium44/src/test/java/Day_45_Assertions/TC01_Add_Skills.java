package Day_45_Assertions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class TC01_Add_Skills {
	
	WebDriver driver;
	
	//Step2 Declaration of Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",PassWord="admin123";
	String SkillName="Java1104",SkillDescr="Java1104 descr";
	
  @Test
  public void MainTest() throws InterruptedException {
	  
	
		
	  TC01_Add_Skills T1=new TC01_Add_Skills();
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM(TestURL); // We have to pass Global Variables in Main Method
	  T1.Login(UserName,PassWord);
	  
	  
	  T1.AddSkills(SkillName,SkillDescr);
	
  }
  
  
  
  public void OpenChromeBrowser()
  {
	  //Launch Chrome browser
	    
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
  }
  
  public void OpenOrangeHRM(String TestURL1)//Method Local variables
  {
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.get(TestURL1);
		
  }
  
  public void Login(String UserName1,String PassWord1) throws InterruptedException//Step1 - Replace every value with Method Local variables
  {
		
		driver.findElement(By.name("username")).sendKeys(UserName1);
		driver.findElement(By.name("password")).sendKeys(PassWord1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(6000);
		
		
		//boolean flag=true;
		
		
		
		//flag=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).isDisplayed();
		//flag=true;
		
		//Assert.assertEquals(flag, false); 
		
		//Dashboard
		String str=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
				
				//Assert.assertEquals(str, "Dashboards");
		
		SoftAssert s1=new SoftAssert();
		
		if(str.equals("Dashboard123"))
		{
			s1.assertEquals(str, "Dashboard");
			Reporter.log("Soft assesertion success for Dashboard page validation");
		}
		else
		{
			s1.assertEquals(str, "Dashboard");
			Reporter.log("Soft assesertion failed for Dashboard page validation");
		}
		
		
  }
  
  public void AddSkills(String SkillName1,String SkillDesc1)
  {
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDesc1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
  }
  
  
  
}
