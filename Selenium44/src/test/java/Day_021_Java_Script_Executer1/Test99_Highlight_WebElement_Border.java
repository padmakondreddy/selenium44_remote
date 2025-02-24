package Day_021_Java_Script_Executer1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test99_Highlight_WebElement_Border {
	
	WebDriver driver;

	@Test
	public void AmazonSendKeys() {
	
		
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//We have to create JavascriptExecutor Reference Object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//We have to create WebElement Object Reference
		WebElement Mobile_Web_Element = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		js.executeScript("arguments[0].style.border='3px solid green'", Mobile_Web_Element);
		


	}

}
