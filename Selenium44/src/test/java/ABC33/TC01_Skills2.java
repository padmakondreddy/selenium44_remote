package ABC33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills2 {
	static WebDriver driver;
	
  @Test
  public void SkillsTest() throws Exception {
	
	
	  TC01_Skills2.OpenChromeBrowser();
	  TC01_Skills2.OpenOrangeHRM();
	  TC01_Skills2.Login();
	  TC01_Skills2.AddSkills();
	  
	  
  }
  
  
  public static void OpenChromeBrowser() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  
  
  public static void OpenOrangeHRM() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  
  public static void Login() throws Exception {
	  
	 findElement(By.name("username")).sendKeys("Admin");
	 findElement(By.name("password")).sendKeys("admin123");
	  findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
  }
  
  public static void AddSkills() throws Exception {
	  
	findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	  findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
	 findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
	findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			
			
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Java2001");
	findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("jav2001 descr");
	 findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
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

  
  
  
  
  
}
