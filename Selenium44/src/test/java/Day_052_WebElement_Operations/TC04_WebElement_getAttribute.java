package Day_052_WebElement_Operations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TC04_WebElement_getAttribute {
	
WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			
	
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.amazon.in/");
				
				
			
				
				 //To print attribute value
				String str=driver.findElement(By.linkText("Best Sellers")).getAttribute("href"); //true or false
				String str1=driver.findElement(By.linkText("Best Sellers")).getAttribute("tabindex"); //true 
				
				String str2=driver.findElement(By.linkText("Best Sellers")).getText(); 
				
				System.out.println("Link is : "+str);
				System.out.println("tabindex is : "+str1);
				System.out.println("tabindex is : "+str2);

		}
	

}
