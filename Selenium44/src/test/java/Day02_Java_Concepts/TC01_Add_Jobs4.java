package Day02_Java_Concepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs4 {
	
	
	static WebDriver  driver;
	
	//Step1 - We have to declare variables
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",PassWord="admin123";
	String JobTitle="Sales8",JobDescr="Sales8 Descr",JobNote="Sales8 Note";
	
  @Test
  public void JobsTest() {
	  

	 
		
	  TC01_Add_Jobs4.open_Chrome_Browser();  
	  TC01_Add_Jobs4.open_OrangeHRM(TestURL);      //step2 - We are passing global variables to appriopriate methods  
	  TC01_Add_Jobs4.Login(UserName,PassWord);   //step2 - We are passing global variables to appriopriate methods  
	  TC01_Add_Jobs4.AddJobs(JobTitle,JobDescr,JobNote);
		
  }
  
  
 
  
  
  public static void open_Chrome_Browser()
  {
		 driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  
  public static void open_OrangeHRM(String TestURL1)
  {
	  driver.get(TestURL1);
  }
  
  
  public static void Login(String UserName1,String PassWord1)
  {

		driver.findElement(By.name("username")).sendKeys(UserName1);
		driver.findElement(By.name("password")).sendKeys(PassWord1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
  }
  
  
  
  
  public static void AddJobs(String JobTitle1,String JobDsscr1,String JobNote1)
  {
	  	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobTitle1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDsscr1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		
  }
  
  
  
  
  
  
  
  
}
