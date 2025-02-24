package Day_021_Java_Script_Executer1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4_Scroll_at_specific_webElement {
	
	WebDriver driver;

	@Test
	public void AmazonSendKeys() throws InterruptedException {
	
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//step1
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//step2
		
		WebElement FaceBookElement =driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		js.executeScript("arguments[0].scrollIntoView();", FaceBookElement);
		
		Thread.sleep(5000);
		js.executeScript("arguments[0].style.border='3px solid red'", FaceBookElement);
		
		//js.executeScript("arguments[0].click();", FaceBookElement);
		
	}

}
