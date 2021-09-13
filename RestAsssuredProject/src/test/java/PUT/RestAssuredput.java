package PUT;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredput {

	@Test
	public void restAssuredput() throws JSONException
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		String name="joh";
		RequestSpecification request=RestAssured.given();
		JSONObject reqparam=new JSONObject();
		reqparam.put("job", "dummy");
		reqparam.put("name", "john");
		request.header("Content-Type", "application/json");
		
		request.body(reqparam.toString());
		Response response=request.put("/update/"+name);
		
		 int statusCode = response.getStatusCode();
		 System.out.println(response.asString());
		 Assert.assertEquals(statusCode, 200);
	}
}
