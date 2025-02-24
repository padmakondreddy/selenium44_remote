package ABC4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Logiin {
	
	WebDriver driver; // Declare a webdriver object
	
	
  @Test
  public void LoginTest1() {

		driver =new ChromeDriver(); //Chrome Browse window launched
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		  
  }
  
  
  
  
}
