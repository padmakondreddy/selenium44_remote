package Day_027_Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.Alert;


public class AlertDemo {
	
	static WebDriver driver;
            

                @Test
                public void testWebAlert() throws InterruptedException { 
                	
                
            		driver =new ChromeDriver();
            		driver.manage().window().maximize() ;	
                    // Alert Message handling
                	  driver.get("https://javascript.info/alert-prompt-confirm");
                	  
                                // clicking on try it button
                                driver.findElement(By.linkText("Run the demo")).click();
                                Thread.sleep(5000);

                                Alert alert1 = driver.switchTo().alert();
                                alert1.sendKeys("Sudhakar");

                                Thread.sleep(5000);
                              //  System.out.println(driver.switchTo().alert().getText());
                                alert1.dismiss();
                                
                                Thread.sleep(5000);
                                
                                alert1.accept();
                                
                               // driver.quit();
                                
                                
              //  Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
                
              //  Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                
              //  alert = driver.switchTo().alert();
                
                                
                }


               
} 