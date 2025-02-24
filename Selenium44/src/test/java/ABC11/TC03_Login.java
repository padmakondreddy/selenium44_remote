package ABC11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC03_Login {
	
	WebDriver driver;
	
  @Test
  public void amazon() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://amazon.in");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  
	  
  }
  
  
}
