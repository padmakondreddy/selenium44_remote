package ABC17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs {
	
	WebDriver driver;
	
	
 @Test
  public void SkilsTest() throws Exception {
	  
	 TC01_Add_Jobs T1=new TC01_Add_Jobs();
	 
	 T1.OpenChromeBrowser();
	 T1.OpenOrangeHRM();
	 T1.Login();
	 T1.AddJobs();

	 
		
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
  
  
  
  
  
  
  public void OpenChromeBrowser() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize(); 
	  
  }
  
  public void OpenOrangeHRM() {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //Implicit Wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
  }
  
  
  public void Login() throws Exception {
	  
	  
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		findElement(By.cssSelector("button[type='submit']")).click();
		
  }
  
  
  public void AddJobs() throws Exception {
	  
	 findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
	 findElement(By.xpath("//span[text()='Job ']")).click(); //Job
	 findElement(By.linkText("Job Titles")).click();//Job Titles
	 
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();//Add button
	
	
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Sales2");
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Sales2 descr");
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("Sales2 Note");
  
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();//Save
	 
	
  
  }
  
  
  
  
}
