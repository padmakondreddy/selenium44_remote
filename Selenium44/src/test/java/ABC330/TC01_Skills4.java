package ABC330;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills4 {
	WebDriver driver;
	
	//Step1
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",PassWord="admin123";
	String SkillName="Java553",SkillDescr="Java553 descr";
	
  @Test
  public void SkillSTest() throws Exception {
	  TC01_Skills4 t1=new TC01_Skills4();
	  t1.OpenChromeBrowser();
	  t1.OpenOrangeHRM(TestURL);//Step2
	  t1.Login(UserName,PassWord);//Step2
	  t1.AddSkills(SkillName,SkillDescr);//Step2
		
		
  }
  
  
  
  
  
  public void OpenChromeBrowser() throws Exception {
  
	 	driver =new ChromeDriver();
			driver.manage().window().maximize() ;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
  
  }
  
  
  public void OpenOrangeHRM(String TestURL1) throws Exception {
	  
	  driver.get(TestURL1);
	  
	  
	  
  }
  
  public void Login(String UserName1,String PassWord1) throws Exception {
	  

		findElement(By.name("username")).sendKeys(UserName1);
		findElement(By.name("password")).sendKeys(PassWord1);
		findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	  
  }
  
  
  public void AddSkills(String SkillName1,String SkillDescr1) throws Exception {
	  

		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName1);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr1);
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
	  
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
