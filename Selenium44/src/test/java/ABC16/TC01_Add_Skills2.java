package ABC16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills2 {
	
	static  WebDriver driver;
	
	
 @Test
  public void SkilsTest() {
	  
	
	 
	 TC01_Add_Skills2.OpenChromeBrowser();
	 TC01_Add_Skills2.OpenOrangeHRM();
	 TC01_Add_Skills2.Login();
	 TC01_Add_Skills2.AddSkills();
	 
		
  }
  
  
  
  
  
  
  public static void OpenChromeBrowser() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize(); 
	  
  }
  
  public static void OpenOrangeHRM() {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //Implicit Wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
  }
  
  
  public static void Login() {
	  
	  
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
  }
  
  
  public static void AddSkills() {
	  
	  driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		driver.findElement(By.linkText("Skills")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).
		sendKeys("Java 15");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).
		sendKeys("Java 15 descr");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
	  
  }
  
  
  
  
}
