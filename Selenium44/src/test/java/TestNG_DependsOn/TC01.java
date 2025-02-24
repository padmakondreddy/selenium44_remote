package TestNG_DependsOn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 {
	
	WebDriver driver;
	
	@Test
	public void OpenBrowser() {
		  
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		  
	  }
	  
	
	
	
  @Test (dependsOnMethods = { "OpenBrowser" })
  public void OpenOrangeHRM() {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }
  
  
  
	
  @Test (dependsOnMethods = { "OpenOrangeHRM" })
  public void LoginTest() {
	  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
  }
  
  
  
}
