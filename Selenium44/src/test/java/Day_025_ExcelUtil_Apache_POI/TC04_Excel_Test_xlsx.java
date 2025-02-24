package Day_025_ExcelUtil_Apache_POI;

//step1
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;


import org.testng.annotations.Test;



import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;


public  class TC04_Excel_Test_xlsx
{
		

    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    
    public FileInputStream fis = null;
    public FileOutputStream fout=null;
  
    

    
    

    @Test
    public void hello()throws Exception
    {
    	
    	TC04_Excel_Test_xlsx E1=new TC04_Excel_Test_xlsx();
    	
    	//String orderno=driver.findElement(By.id("")).getText();
    	
    	E1.PutCellData( "C://Users//trith//Documents//TestData2.xlsx","Sheet6",0,0,"Admin");
    	E1.PutCellData( "C://Users//trith//Documents//TestData2.xlsx","Sheet6",0,1,"admin123");
    	
    }
    
    
    public  void PutCellData(String xlFilePath,String sheetName,int rowNum,int column,String Text)
    		throws Exception
    {
   
   	 
   	 	fis = new FileInputStream(xlFilePath);
        workbook = new XSSFWorkbook(fis);
    	sheet = workbook.getSheet(sheetName);
    	
    	if(sheet.getRow(rowNum)==null)
    	{
    		row=sheet.createRow(rowNum);
    	}
    	else
    	{
    		row=sheet.getRow(rowNum);
    	}
    	
    	
    	if(row.getCell(column)==null)
    	{
    		cell=row.createCell(column);
    	}
    	else
    	{
    		cell=row.getCell(column);
    	}

   	
    	cell = sheet.getRow(rowNum).getCell(column);  
    	cell.setCellValue(Text);
    	
         
         CellStyle cs1 = workbook.createCellStyle(); 
         cs1.setFillForegroundColor(IndexedColors.WHITE.getIndex()); 
         cs1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
     
         Font font = workbook.createFont();
         font.setColor(IndexedColors.BLUE.getIndex());
         font.setBold(false);
         cs1.setFont(font);
   
    	
    	System.out.println("Text:"+Text);
    	cell.setCellStyle(cs1);
    	cell.setCellValue(Text);
    	
  
    	
    	fout= new FileOutputStream(xlFilePath);
    	workbook.write(fout);
     
        fout.flush();
        fout.close();
        workbook.close();
        fis.close();
 
    }
    
    
    
    
    
    
}

