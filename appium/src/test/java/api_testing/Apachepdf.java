package api_testing;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Apachepdf {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub


	
	//	public static WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./Driver2\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=sample+pdf+file+url+for+testing&oq=sample+pdf+file+url+for+testing&aqs=chrome.0.69i59.7609j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[text() = 'PDF File - W3C']")).click();
		Thread.sleep(10000);
		
		String geturl=driver.getCurrentUrl();
		
		System.out.println(geturl);
		
		//File f=new File("C:\\Users\\Nothing\\eclipse-workspace\\appium\\Driver2\\Reg_Print.pdf");
		
		URL pdurl=new URL(geturl);
		
		BufferedInputStream bgf=new BufferedInputStream(pdurl.openStream());
		PDDocument doc=PDDocument.load(bgf);
		
		PDFTextStripper urstr=new PDFTextStripper();
		
		String urgettest=urstr.getText(doc);
		
		System.out.println(urgettest);
		/*File f=new File("C:\\Users\\Nothing\\Desktop\\sample.pdf");
		
		FileInputStream fis=new FileInputStream(f);
		PDDocument doc=PDDocument.load(fis);
		
		PDFTextStripper str=new PDFTextStripper();
		
		String gettest=str.getText(doc);
		
		System.out.println(gettest);
		
		String t1="A Simple PDF File ";
		
		if(t1.equals(gettest.startsWith("A Simple PDF File")))
		{
			System.out.println("Test pass becase  pdf file fistart  A Simple PDF File ");
		}
		else {
			
			System.out.println("Test fail due to pdf file did not start  A Simple PDF File ");
		}
		
	   */
	   doc.close();
		bgf.close();
	
	}

}
