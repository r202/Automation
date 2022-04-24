package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	
	
	
	public FileInputStream fi;
	public FileOutputStream fo;

	public 	XSSFWorkbook wb;
	public 	XSSFSheet sheet;
	public 	XSSFRow row;
	public	 XSSFCell cell;
	public 	 String path="C:\\Users\\Nothing\\eclipse-workspace\\appium\\Excel\\Worksheet1.xlsx";;
		
		
		
		
		
		public  int getRowCount(String sheetName) throws IOException 
			{
			fi=new FileInputStream(path);
			wb=new XSSFWorkbook(fi);
			sheet=wb.getSheet(sheetName);
			int rowcount=sheet.getPhysicalNumberOfRows();
			
			System.out.println(rowcount);
			//
			wb.close();
			fi.close();
			return rowcount;
			}
		public  int coloumCount(String sheetName,int rownum) throws IOException
		{
			fi=new FileInputStream(path);
			wb=new XSSFWorkbook(fi);
			sheet=wb.getSheet(sheetName);
			row=sheet.getRow(rownum);
			int cellcount=row.getPhysicalNumberOfCells();
			wb.close();
			fi.close();
			return cellcount;
		} 
		
		public  String getCelldata(String sheetName,int rownum,int colnum) throws IOException
		{
			
			
			fi=new FileInputStream(path);
			//fi=new FileInputStream(path);
			wb=new XSSFWorkbook(fi);
			sheet=wb.getSheet(sheetName);
			row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		System.out.print(cell);
		//.getStringCellValue();
		
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
		return data;
		
		}
	
		
	/*public  Object getCellValue(Cell cell)
		    {
		        switch (cell.getCellType()) {
		        case STRING:cell.getStringCellValue();
		            return cell.getStringCellValue();
		 
		        case BOOLEAN:cell.getBooleanCellValue();
		            return cell.getBooleanCellValue();
		 
		        case NUMERIC:cell.getNumericCellValue();
		            return cell.getNumericCellValue();
		        }
				return null;
		 
		        
		 }
		
		
	*/
		

	}


