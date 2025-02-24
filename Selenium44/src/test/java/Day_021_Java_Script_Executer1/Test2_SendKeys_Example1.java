package Day_021_Java_Script_Executer1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2_SendKeys_Example1 {
	
	WebDriver driver;

	@Test
	public void AmazonSendKeys() {
	
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("Mobiles");
		
		//1.We have to create JavascriptExecutor Reference Object
		
		
		//2.We have to create WebElement Object Reference
		 WebElement searchElement1 = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		 //js.executeScript("arguments[0].setAttribute('value','Laptops')", searchElement);
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			
		 
		 js.executeScript("arguments[0].value = 'Laptops';", searchElement1);
		
		 //To Type Text in a Text Box without using sendKeys() method
		
	}

}
