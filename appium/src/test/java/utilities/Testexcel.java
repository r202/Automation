package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testexcel {

	
	
	
	public FileInputStream fi;
	public FileOutputStream fo;

	public 	XSSFWorkbook wb;
	public 	XSSFSheet sheet;
	public 	XSSFRow row;
	public	 XSSFCell cell;
	public 	 String path="C:\\Users\\Nothing\\eclipse-workspace\\appium\\Excel\\Worksheet1.xlsx";
	
	
	public Object cellValue() throws IOException
	{
		
		
		fi=new FileInputStream(path);
		//fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sheet=wb.getSheet("Sheet2");
		row=sheet.getRow(1);
	cell=row.getCell(1);
	//System.out.print(cell);
	DataFormatter formatter=new DataFormatter();
	
	 String data;
	  try {
	  data=formatter.formatCellValue(cell);
	  }
	  catch(Exception ex)
	  {
		  data="";
	  }
		
		
		wb.close();
		fi.close();
		return data ;
		
		}
	
	
	
	
	/* switch (cell.getCellType()) {
     case STRING:cell.getStringCellValue();
         return cell.getStringCellValue();

     case BOOLEAN:cell.getBooleanCellValue();
         return cell.getBooleanCellValue();

     case NUMERIC:cell.getNumericCellValue();
         return cell.getNumericCellValue();
     }
		return cell;
	*/

	}
	
	
	

