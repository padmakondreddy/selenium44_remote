package ABC6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills {
	
	WebDriver driver;
	
  @Test
  public void SkilsTest() {
	 
	  	driver =new ChromeDriver(); //Chrome Browse window launched
		driver.manage().window().maximize() ;	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//Admin
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
				
		//Qualificcaations
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		
		//Skills
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
				

		//Add
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
		//Skill Name
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Java14");
		
		//Skill Descr
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Java14 descr");
		
		//Save button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
		
  }
  
  
  
}
