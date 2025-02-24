package ABC15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login2 {
	
	
	WebDriver driver;
	
  @Test
  public void LoginTest() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://amazon.in");
	  
	  //Implicit Wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
			  
			  
			  
	List<WebElement> ELEMENETS=driver.findElements(By.cssSelector("input[type='submit']"));
			  
	System.out.println(ELEMENETS.size());
	
	
			  
	  
	  
	 // nav-input nav-progressive-attribute
	  
	 // driver.findElement(By.className("nav-input")).sendKeys("Mobiles");
	  
	 // driver.findElement(By.linkText("Inbox(150)")).click();
	 // driver.findElement(By.partialLinkText("Inbox")).click();
	  
	 // driver.findElement(By.partialLinkText("Amazon mini")).click();
	  
	 /* 
	 CSSSSelector
	 XPATH
	 ID
	 NAME
	 linkText
	 partialLinkText
	 className
	 tagName
	 */
	
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
  }
  
  
}
