package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Intilization.Testbase;
import objectives.Homepage;
import objectives.Registraction;


public class Runner extends Testbase {
	 
	
	
	
	@Test(priority=0)
	public void test1() throws InterruptedException
	
	{
	
		Homepage pg=new Homepage(driver);
		System.out.println("driver displayed----------------->"+driver);
		pg.homepageSignupButton();
	//System.out.println(Datadriven.cell1);
		Thread.sleep(3000);
	}
	
	
	
	@Test(priority=1)
	public void test2() throws InterruptedException, IOException
	
	{
		
		 Registraction reg=new Registraction(driver);	
		   reg.reg_istraction();
		
		
	}
	

}
