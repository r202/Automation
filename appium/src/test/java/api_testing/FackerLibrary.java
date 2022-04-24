package api_testing;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class FackerLibrary {
	
	
	@Test
	void fake_library()
	{
	
	FakeValuesService fvs=new FakeValuesService(new Locale("en-IND"),new RandomService());
		
	 //letterify: ?-->represents letter
	String ly=fvs.letterify("?????"); //---->smallletters
	System.out.println(ly);
	
	String ly1=fvs.letterify("?????",true);  //asssign true keyword print capital letters
	
	System.out.println(ly1);
	
	    //Numerify: #-->represents number
	String number=fvs.numerify("#######");
	
	System.out.println(number);
	
	 //bothify: 
	
	String both=fvs.bothify("???##??##");//---->smallletters
	System.out.println(both);
	
	String both1=fvs.bothify("???##??##",true);  //---->capital letters
	
	System.out.println(both1);
	//Regexify
	
	String customstring=fvs.regexify("[a-z0-9]{10}");
	
	System.out.println(customstring);
	String customstring1=fvs.regexify("[A-Z0-9]{10}");
	
	
	System.out.println(customstring1);
		
	}
	
	
	
	
	
	
	
	
	

}
