package api_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.hamcrest.core.Is;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ApitestingExample {
	
	
	
	
	
@Test(priority=1 )
	void passing_Quar_yparameters() 
	{
		baseURI="https://reqres.in/api";
		
		given().queryParam("data",7).log().headers().
		when()
		   .get("/users")
		.then()
		.statusCode(200).assertThat();
		  
		

		
		
	
		
		
	}
	
	
	
	@Test(priority=2)
	void passin_Path_parameters() 
	{
		
		baseURI="https://reqres.in/";
        basePath="api/users";
		given()
		   .pathParam("id",10)
		   .log().body().
		when()
		   .get("{id}").
	   then()
		.statusCode(200).assertThat();		  
		

}
	
	
	@Test(priority=3)
	void get_Required_path_parameters() 
	{
		
     	given().
				when()
		   .get("https://reqres.in/api/users?page=2")
		  .then().assertThat()
		                   .body("per_page",Is.is(6) )
		                   .body("data.first_name[0]", Is.is("Michael"))
	                       .body("data.first_name[1]", Is.is("Lindsay"))
	                       .body("data.first_name[2]", Is.is("Tobias"))
	                       .body("data.id[0]",Is.is(7));
	}

	
	@Test(priority=4)
	void post_method() 
	{
		//Pass(post) the data to server using String data
		
	/*	String load = "{\"name1\":\"morpheus1\", \"job1\":\"leader1\"}";  
     	
     	 Response resp=	given().
     	auth().none().header("Content-Type","application/json")
     	.when().body(load)
	    .post("https://reqres.in/api/users");
     System.out.println(resp.asString());
     System.out.println(resp.statusCode());
  */   
     
   //Pass(post) the data to server using Map
     
     HashMap<String,String>map=new HashMap<String,String>();
     map.put("name1", "morpheus1");
     map.put("job1", "leader1");
    
     Response resp=	given().
     	auth().none().header("Content-Type","application/json")
     	.when().body(map).log().all()
	    .post("https://reqres.in/api/users");
     System.out.println(resp.asString());
     System.out.println(resp.statusCode());
    
	}
	
	@Test(priority=4)
	void own_DB() 
	{
	
   //Pass(post) the data to server using Map
     
     HashMap map=new HashMap();
     map.put("id", 25);
     map.put("firstName", "leader1");
     
     
    
     Response resp=	given().
     	auth().none().header("Content-Type","application/json")
     	.when().body(map).log().all()
	    .post("http://localhost:3000/users");
     System.out.println(resp.asString());
     System.out.println(resp.statusCode());
    
	}
	
	
	@Test(priority=4)
	void dELETE() 
	{
	
   
      Response resp=
    		  given().
			     	auth().none()
			     	.header("Content-Type","application/json")
			     	.when()
				    .delete("http://localhost:3000/users/24");
      System.out.println(resp.asString());
    
	}
	
	
	

	@Test(priority=4)
	void jSon_array_Object() 
	{
	
   
      JSONObject obj=new JSONObject();
      obj.put("", "");
      obj.put("", "");
      
      JSONArray uy=new JSONArray();
     
	}
	
	
	 
}


