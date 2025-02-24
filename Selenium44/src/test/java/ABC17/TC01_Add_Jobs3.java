package ABC17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs3 {
	
	static WebDriver driver;
	
	
	//Step1 - Delcare all methods input values globally
	static String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String UserName="Admin",PassWord="admin123";
	static String jobTitle="Sales52",JobDescr="Sales52 descr",JobNote="Sales52 Note";
	
 @Test
  public void SkilsTest() throws Exception {
	  
	
	 
	 TC01_Add_Jobs3.OpenChromeBrowser();
	 TC01_Add_Jobs3.OpenOrangeHRM(TestURL); //step2
	 TC01_Add_Jobs3.Login(UserName,PassWord);//step2
	 TC01_Add_Jobs3.AddJobs(jobTitle,JobDescr,JobNote);//step2

	 
		
  }
 
 

public static WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}
  
  
  
  
  
  
  public static void OpenChromeBrowser() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize(); 
	  
  }
  
  public static void OpenOrangeHRM(String TestURL1) {
	  
	  driver.get(TestURL1);
	  
	  //Implicit Wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
  }
  
  
  public static void Login(String UserName1,String PassWord1) throws Exception {
	  
	  
		findElement(By.name("username")).sendKeys(UserName1);
		findElement(By.name("password")).sendKeys(PassWord1);
		findElement(By.cssSelector("button[type='submit']")).click();
		
  }
  
  
  public static void AddJobs(String jobTitle1,String JobDescr1,String JobNote1) throws Exception {
	  
	 findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
	 findElement(By.xpath("//span[text()='Job ']")).click(); //Job
	 findElement(By.linkText("Job Titles")).click();//Job Titles
	 
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();//Add button
	
	
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(jobTitle1);
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDescr1);
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote1);
  
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();//Save
	 
	
  
  }
  
  
  
  
}
