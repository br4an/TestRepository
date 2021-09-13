package POST;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RestAssuredPOST2 {
	
	//@Test
	public void RestAssuredPost() throws JSONException
	{
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		System.out.println(obj);
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(obj.toString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
	}
	
	//@Test
	public void RestAssuredPut() throws JSONException
	{
		JSONObject obj=new JSONObject();
		obj.put("name", "branhampaul");
		obj.put("job", "QAEngg");
		
		System.out.println(obj);
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(obj.toString())
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test	
	public void RestAssuredPatch() throws JSONException
	{
		JSONObject obj=new JSONObject();
		obj.put("name", "ham75222222220");
		obj.put("job", "QAEngg");
		
		System.out.println(obj);
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(obj.toString())
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
	}

}
