package api_testing;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Extractdata_jsonpath {
	
	
	@Test
	void jsonpath()
	{
		 Response resp=
	    		  given().contentType(ContentType.JSON).log().all()
				     	
					    .get("http://localhost:3000/courses");
		resp.prettyPrint();
		 
		// System.out.println(resp);
		 
		
		 JsonPath exactor=resp.jsonPath();
		 
	String fn= exactor.get("Tool");
		 
		System.out.print("shsjcsjhcscjbhb----->"+fn);
		
	/*	 ArrayList<String> f1=exactor.get("courses");
		                         
		
		 for(String m:f1)
		 {
			 
			 System.out.println(m);
		 }
		 
		 */
	}

}
