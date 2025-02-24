package ABC11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC04_Login {
	
	WebDriver driver;
	
  @Test
  public void LoginTest() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://amazon");
	  
	  
  }
  
  
}
