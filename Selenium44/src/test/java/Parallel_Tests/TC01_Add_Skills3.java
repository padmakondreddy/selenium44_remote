package Parallel_Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills3 {
	
	static WebDriver driver;
	//Step1 - Declared Global Variables
	static String TestURL="https://opensource-demo.orangehrmlive.com/";
	static String USERNAME="Admin",PASSWORD="admin123";
	static String SkillName="Java7",SkillDescr="Java7 Descr";
	
  @Test
  public void SkilsTest() {
	 

	  TC01_Add_Skills3.OpenChromeBrowser();
	  TC01_Add_Skills3.OpenOrangeHRM(TestURL);
	  TC01_Add_Skills3.Login(USERNAME,PASSWORD);
	  TC01_Add_Skills3.AddSkills(SkillName,SkillDescr);
  }
  
  
  
  public static void OpenChromeBrowser() {
	  
	  	driver =new ChromeDriver(); //Chrome Browse window launched
		driver.manage().window().maximize() ;	
  
  }
  
  
  
  public static void OpenOrangeHRM(String TestURL1) {
	  

		driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  } 
  
 
  
  public static void Login(String USERNAME1,String PASSWORD1) {
	  
		driver.findElement(By.name("username")).sendKeys(USERNAME1);
		driver.findElement(By.name("password")).sendKeys(PASSWORD1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();  
  }
  
  
  
  public static void AddSkills(String SkillName2,String SkillDescr2) {
	  
	  		//Admin
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
					
			//Qualificcaations
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
			
			//Skills
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
					

			//Add
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			
			//Skill Name
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName2);
			
			//Skill Descr
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).
			sendKeys(SkillDescr2);
			
			//Save button
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
			
	  
  }
  
  
  
  
}
