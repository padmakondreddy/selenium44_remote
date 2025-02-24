package ABC7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Nationality_NonStatic {
	
	WebDriver driver;  // Declaration
	
	//Step1 - Declared Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String USERNAME="Admin",PASSWORD="admin123";
	String NationalityText="Indian115";
	
	
  @Test
  public void Login_Test() {
	  

	  TC01_Nationality_NonStatic  T1=new TC01_Nationality_NonStatic();
		
		T1.OpenChromeBrowser();
		T1.Open_Orange_HRM(TestURL);//Step2
		T1.Login(USERNAME,PASSWORD);//Step2
		T1.AddNationality(NationalityText);//Step2
		
  }
  
  
  
  public void OpenChromeBrowser() {
	  
		driver =new ChromeDriver(); //Chrome Browse window launched
		driver.manage().window().maximize() ;	
  }
  
  public void Open_Orange_HRM(String TestURL1) {
	  

		driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  public void Login(String USERNAME1,String PASSWORD1) {
	  

		driver.findElement(By.name("username")).sendKeys(USERNAME1);
		driver.findElement(By.name("password")).sendKeys(PASSWORD1);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
  }  
 
  public void AddNationality(String NationalityText1) {
	  
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
 
  
  
  
}
