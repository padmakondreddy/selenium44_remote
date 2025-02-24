package ABC16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills {
	
	WebDriver driver;
	
	
 @Test
  public void SkilsTest() throws Exception {
	  
	 TC01_Add_Skills T1=new TC01_Add_Skills();
	 
	 T1.OpenChromeBrowser();
	 T1.OpenOrangeHRM();
	 T1.Login();
	 T1.AddSkills();
	 
		
  }
 
 

public  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", elem);
 
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
  
  
  public void AddSkills() throws Exception {
	  
	 findElement(By.xpath("//span[text()='Admin']")).click();
		findElement(By.xpath("//span[text()='Qualifications ']")).click();
		findElement(By.linkText("Skills")).click();
		
		
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).
		sendKeys("Java 180");
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).
		sendKeys("Java 180 descr");
		
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
	  
  }
  
  
  
  
}
