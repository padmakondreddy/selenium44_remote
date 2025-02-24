package Day_052_WebElement_Operations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TC06_WebElement_isDisplayed2 {
	
WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			
	
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				
				 
				Boolean	str=driver.findElement(By.linkText("Admin")).isDisplayed(); //true or false
		
				
				if(str==true)
				System.out.println("Login is success");
				else
				System.out.println("Login is Failed");
				
			
			

		}
	

}
