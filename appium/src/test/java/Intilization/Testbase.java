package Intilization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



public class Testbase  {
	
	
public static WebDriver driver;
	
	
		
	
	@BeforeClass
    public void intilation()
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./Drivers1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.ielts7band.net/");
			driver.manage().window().maximize();
		
		}

}
