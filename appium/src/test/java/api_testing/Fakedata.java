package api_testing;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Fakedata {
	
	@Test
	void fakeDATA()
	{
		Faker fa=new Faker();
		String fn=fa.address().firstName();
		String ln=fa.address().lastName();
		String bn=fa.address().buildingNumber();
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(bn);
		
	}

}
