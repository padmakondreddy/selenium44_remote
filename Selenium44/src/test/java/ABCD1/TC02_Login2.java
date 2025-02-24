package ABCD1;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02_Login2 {
	
	
	WebDriver driver;
	
  @Test
  public void Login() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  

	  
	  //driver.findElement(By.name("username")).clear();
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	 // driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  
  
}
