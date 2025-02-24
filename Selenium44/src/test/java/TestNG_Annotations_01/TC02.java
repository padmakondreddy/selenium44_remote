package TestNG_Annotations_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC02 {
	
	WebDriver driver;
	
	
  @Test
  public void MainTest() {
	  
	//Login
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//AddNationality
	  driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
	  driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
	  driver.findElement(By.xpath("//button[text()=' Add ']")).click();
			
	  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Indian155");
	  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  
  }
  
  
  @BeforeTest
  public void lauch_chrome_browser() {
	  
	  driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	  
  }

  @AfterTest
  public void closeBrowser() {
	  
	  driver.close();
	  
	  
  }

}
