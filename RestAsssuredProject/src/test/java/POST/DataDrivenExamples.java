package POST;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class DataDrivenExamples {
	
	@Test
	public void postRequest() throws JSONException
	{
		
		
		
		JSONObject obj=new JSONObject();
		obj.put("userId", "jacobx");
		obj.put("firstname", "jacob");
		obj.put("lastname", "xavier");
		
		//baseURI="http://localhost:3000/";
//		given().get("http://localhost:3000/users")
//		.then().statusCode(200).log().all();
		System.out.println("Success");
//		given()
//		.contentType(ContentType.JSON)
//		.accept(ContentType.JSON)
//		.body(obj.toString())
//		.when()
//		.post("http://localhost:3000/users")
//		.then()
//		.statusCode(201)
//		.log().all();
	}

}
