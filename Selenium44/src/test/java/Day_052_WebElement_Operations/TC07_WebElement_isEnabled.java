package Day_052_WebElement_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TC07_WebElement_isEnabled {
	
WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			
				//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				
				//OpenUrl
				driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
	
				Boolean str = driver.findElement(By.name("catName")).isEnabled();//true or false;
				
					if(str==true)
					System.out.println("Button is enabled on WebPage");
					else
					System.out.println("Button is not enabled on WebPage");
					
			
			

		}
	

}
