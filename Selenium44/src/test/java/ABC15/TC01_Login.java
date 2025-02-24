package ABC15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	
	WebDriver driver;
	
  @Test
  public void LoginTest() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://amazon.in");
	  
	  //Implicit Wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	 // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
	  
	  driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("Mobiles");
	  
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  
	  driver.findElement(By.xpath("//*[@id='p_90/6741117031']/span/a/div/label/i")).click();
	  
	 
	  
  }
  
  
}
