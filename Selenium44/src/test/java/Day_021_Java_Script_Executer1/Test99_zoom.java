package Day_021_Java_Script_Executer1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test99_zoom {
	
	WebDriver driver;

	@Test
	public void AmazonSendKeys() throws InterruptedException {
	
		
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//We have to create JavascriptExecutor Reference Object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 150 % zoom setting
		String zoom_setting="document.body.style.zoom='1.5'";
		js.executeScript(zoom_setting);
		
		
		
		Thread.sleep(5000);
		
		//100 % zoom setting
		String zoom_setting1="document.body.style.zoom='1.0'";
		js.executeScript(zoom_setting1);
		

		Thread.sleep(5000);
	
		//String zoom_setting1="100";
		//js.executeScript("document.body.style.zoom='" + zoom_setting +"'");
	
		//Thread.sleep(5000);
		
			
		
		//We have to create WebElement Object Reference
				WebElement Mobile_Web_Element = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
				
				js.executeScript("arguments[0].style.border='3px solid green'", Mobile_Web_Element);
				
				


	}

}
