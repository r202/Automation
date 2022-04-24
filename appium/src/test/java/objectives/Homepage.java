package objectives;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Intilization.Testbase;

public class Homepage extends Testbase {
	
	WebDriver driver;
	  public Homepage(WebDriver driver)
		{
		this.driver=driver;
	     
  PageFactory.initElements(driver, this);
	
}
		
	  
	
	  @FindBy(xpath="//*[@class='navmenu openable']/li[7]/a")
		public static WebElement sign;
		
		
		@FindBy(xpath="(//*[contains(text(),' Sign Up')])[2]")
		public static WebElement sign1;
		
		
		



	public void homepageSignupButton() throws InterruptedException
	{
		
		sign1.click();
		
		
		
		
		
	}


}
