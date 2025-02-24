package ABCD4_May21_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills_Add {
	
	
	WebDriver driver;
	
  @Test
  public void SkilsTest() {
	  

	  TC01_Skills_Add T2=new TC01_Skills_Add();
	  
	  T2.OpenChromeBrowser();
	  T2.OpenOrangeHRM();
	  T2.Login();
	  T2.AddSkills();
	  
  }
  
  
  public void OpenChromeBrowser() {
	  
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
	  
  }
  
 public void OpenOrangeHRM() {
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  
  }
  
 public void Login() {
	 

	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	  
 }
  
 
 public void AddSkills() {
	 

	  //Admin
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
	 
	  //Qualifications
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
	  
	  //Skills
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		
	  //Add button
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	  
	  //SkillName
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Java20");
	  
	  //Skill descr
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Java20 descr");
	  
	  	//save button
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	  
	  
 }
  
  
}
