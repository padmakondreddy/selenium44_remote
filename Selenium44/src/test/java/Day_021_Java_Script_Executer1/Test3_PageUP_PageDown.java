package Day_021_Java_Script_Executer1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3_PageUP_PageDown {
	
	WebDriver driver;

	@Test
	public void AmazonSendKeys() throws InterruptedException {
	
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		//WebElement Element = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");//PageDown
		
		
		
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");//PageUp
		
	}

}
