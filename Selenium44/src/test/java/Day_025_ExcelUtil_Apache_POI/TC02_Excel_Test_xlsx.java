package Day_025_ExcelUtil_Apache_POI;

//Step1
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;
import org.apache.poi.ss.usermodel.CellType;



public  class TC02_Excel_Test_xlsx
{
		
	
	//step2
    public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    
    //public FileOutputStream fout=null;

    
    String TestURL,UserName,Password;
    WebDriver driver=null;

    @Test
    public void hello()throws Exception
    {
    	
    	TC02_Excel_Test_xlsx eat=new TC02_Excel_Test_xlsx();
    	 
    	 TestURL=eat.getCellData("C://Users//trith//Documents//TestData2.xlsx","Sheet5",0,0);
    	 UserName=eat.getCellData("C://Users//trith//Documents//TestData2.xlsx","Sheet5",0,1);
    	 Password=eat.getCellData("C://Users//trith//Documents//TestData2.xlsx","Sheet5",0,2);
     	
		 
		 System.out.println(" Test URL :"+TestURL);
		 System.out.println(" UserName value :"+UserName);
		 System.out.println(" Password value :"+Password);
		 
		
	     driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
		 driver.get(TestURL);
				
		 findElement(By.name("txtUsername")).sendKeys(UserName);
		 findElement(By.name("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		 driver.quit();
	
    }
    
    public String getCellData(String xlFilePath, String sheetName,int rowNum,int column) throws Exception
    {
    	fis = new FileInputStream(xlFilePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
         row = sheet.getRow(rowNum);
          cell = row.getCell(column);
       
        if(cell.getCellTypeEnum() == CellType.STRING)
        {	
        	String str6=cell.getStringCellValue();
        	workbook.close();
        	fis.close();
            return str6;
        }
        
        else if(cell.getCellTypeEnum() == CellType.NUMERIC)
        {	
        	
        	int i = (int)cell.getNumericCellValue();   //i=123
        	String str6 = String.valueOf(i);          // str6="123";
        	workbook.close();
        	fis.close();
            return str6;
        }
        else 
        {
        	String str6=cell.getStringCellValue();
        	workbook.close();
        	fis.close();
            return str6;
        }
        
    } 
    
      
    
    
    
    
    

	 public  WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}

	
    
    
    
    
    
    
    
    
    
}

