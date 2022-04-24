package objectives;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Intilization.Testbase;

import utilities.ExcelData;
import utilities.Property;
import utilities.Testexcel;

public class Registraction extends Testbase{
	
	WebDriver driver;
	
	Testexcel tr=new Testexcel();
	// Excel_Reaer xs=new Excel_Reaer();
Property pr=new Property();
	
	public Registraction(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	 @FindBy(xpath="//*[@id='naam']")
		public static WebElement Name;
	 
	 @FindBy(xpath="//*[@id='email']")
		public static WebElement Emil;
	 @FindBy(xpath="//*[@id='nationality']")
		public static WebElement country;
	 @FindBy(xpath="caddress")
		public static WebElement Address;
	
	

	 
	 public  void reg_istraction() throws InterruptedException, IOException
		{
		
		 
		 
		 
	
		 
		 ExcelData data1=new ExcelData();
		 Name.sendKeys(data1.getCelldata("Sheet2", 1, 0));
	//Name.sendKeys(pr.propertyfile("name"));------>property
//	Emil.sendKeys(data1.getCelldata("Sheet2", 1, 1));
	// Address.sendKeys(pr.propertyfile("address"));
		}
		
	 
	 
	 
	 
	 
	 
}
