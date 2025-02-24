package Parallel_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Skills2 {
	
	WebDriver driver;
	
	//Step1 - Declared Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String USERNAME="Admin",PASSWORD="admin123";
	String SkillName="Java51",SkillDescr="Java51 Descr";
	String NationalityText="Indian143";
	
  @Test
  public void SkilsTest() {
	 

	  TC01_Add_Skills2 T2=new TC01_Add_Skills2();
	  
	  T2.OpenChromeBrowser();
	  T2.OpenOrangeHRM(TestURL);
	  T2.Login(USERNAME,PASSWORD);
	  T2.AddSkills(SkillName,SkillDescr);
  }
  
  
  @Test
  public void NationalityTest() {
	 

	  TC01_Add_Skills2 T2=new TC01_Add_Skills2();
	  
	  T2.OpenChromeBrowser();
	  T2.OpenOrangeHRM(TestURL);
	  T2.Login(USERNAME,PASSWORD);
	  T2.AddNationality(NationalityText);
  }
  
  
  
  
  
  
  public  void AddNationality(String NationalityText1) {
	  
		//Admin
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
				
				//Nationalities
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
				
				//Add
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
				
				//Nationality Name Text Field
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(NationalityText1);
				
				//Save button
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
				
		  
	  }  
	 
  
  
  
  public void OpenChromeBrowser() {
	  
	  	driver =new ChromeDriver(); //Chrome Browse window launched
		driver.manage().window().maximize() ;	
  
  }
  
  
  
  public void OpenOrangeHRM(String TestURL1) {
	  

		driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  } 
  
 
  
  public void Login(String USERNAME1,String PASSWORD1) {
	  
		driver.findElement(By.name("username")).sendKeys(USERNAME1);
		driver.findElement(By.name("password")).sendKeys(PASSWORD1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();  
  }
  
  
  
  public void AddSkills(String SkillName1,String SkillDescr1) {
	  
	  		//Admin
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
					
			//Qualificcaations
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
			
			//Skills
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
					

			//Add
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			
			//Skill Name
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName1);
			
			//Skill Descr
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr1);
			
			//Save button
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
			
	  
  }
  
  
  
  
}
