package ABC1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver; 
	
	
  @Test
  public void login() {
	
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	 
	 
	 
	 
	 
	 
	 
	 
  }
  
  
}
