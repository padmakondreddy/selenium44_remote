package Jan28_2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	
	WebDriver driver;
	
  @Test
  public void LoginTest() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://amazon.in");
	  
	  //driver=new EdgeDriver();
	  
	  
  }
  
  
  
  
}
