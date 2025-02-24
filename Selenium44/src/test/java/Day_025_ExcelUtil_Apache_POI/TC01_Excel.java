package Day_025_ExcelUtil_Apache_POI;

import org.testng.annotations.Test;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Step1
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class TC01_Excel {
	
	
	//step2
    public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    
    String TestURL,UserName,Password;
	WebDriver driver;
	
  @Test
  public void ReadDataFromExcel() throws IOException {
	  
	  TC01_Excel E1=new TC01_Excel();
 	 
	  TestURL=E1.getCellData("C://Users//trith//Documents//TestData2.xlsx","Sheet5",0,0);
 	 UserName=E1.getCellData("C://Users//trith//Documents//TestData2.xlsx","Sheet5",0,1);
 	 Password=E1.getCellData("C://Users//trith//Documents//TestData2.xlsx","Sheet5",0,2);
  	
 	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get(TestURL);
	
	driver.findElement(By.name("username")).sendKeys(UserName);
	driver.findElement(By.name("password")).sendKeys(Password);
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
  
 	 
		   
  }


public String getCellData(String xlFilePath, String sheetName,int rowNum,int column) throws IOException {
	
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
  
  
  
  
  
}
