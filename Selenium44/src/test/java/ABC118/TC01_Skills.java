package ABC118;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills {
	
	WebDriver driver;
	
	//Step1
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",PassWord="admin123";
	String SkillName="Java184",SkillDescr="Java184 descr";
	
	
	
  @Test
  public void SkilsTest() {

	
	  TC01_Skills t1=new TC01_Skills();
	  t1.openChromeBrowser();
	  t1.openOrangeHRM(TestURL);
	  t1.Login(UserName,PassWord);
	  t1.AddSkills(SkillName,SkillDescr);
		
  }
  
  
  
  public void openChromeBrowser() {
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize(); 
  }
  
  
  public void openOrangeHRM(String TestURL1) {
	  
  driver.get(TestURL1);
	  
	  //Implicit Wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  
  public void Login(String UserName1,String PassWord1) {
	  
	  driver.findElement(By.name("username")).sendKeys(UserName1);
	  driver.findElement(By.name("password")).sendKeys(PassWord1);
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
  }
  
  public void AddSkills(String SkillName1,String SkillDescr1) {
	  
	  driver.findElement(By.xpath("//span[text()='Admin']")).click();
	  driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
	  driver.findElement(By.linkText("Skills")).click();
		
		
		
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).
		sendKeys(SkillName1);
		
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).
		sendKeys(SkillDescr1);
		
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
	  
  }
  
  
  
  
  
  
  
}
