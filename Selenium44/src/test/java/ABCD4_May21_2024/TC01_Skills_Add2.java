package ABCD4_May21_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills_Add2 {
	
	
	static WebDriver driver;
	
  @Test
  public void SkilsTest() {
	  
	  TC01_Skills_Add2.OpenChromeBrowser();
	  TC01_Skills_Add2.OpenOrangeHRM();
	  TC01_Skills_Add2.Login();
	  TC01_Skills_Add2.AddSkills();
	  
  }
  
  
  public static void OpenChromeBrowser() {
	  
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
	  
  }
  
 public static void OpenOrangeHRM() {
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  
  }
  
 public static void Login() {
	 

	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	  
 }
  
 
 public static void AddSkills() {
	 

	  //Admin
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
	 
	  //Qualifications
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
	  
	  //Skills
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		
	  //Add button
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
	  
	  //SkillName
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Java21");
	  
	  //Skill descr
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Java21 descr");
	  
	  	//save button
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	  
	  
 }
  
  
}
