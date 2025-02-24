package Day_052_WebElement_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TC08_WebElement_isSelected {
	
WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception 
		{
			
				
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				
				//OpenUrl  
				driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	
				
				
				Boolean str = driver.findElement(By.xpath("//*[@id='Content']/div[1]/blockquote[1]/form/input[1]")).isSelected();
				
				if(str==true)
					System.out.println("Checkbox is selected on WebPage");
					else
				System.out.println("Checkbox is not selected on WebPage");
					
			

		}
	

}
