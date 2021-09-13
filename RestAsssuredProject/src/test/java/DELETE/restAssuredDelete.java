package DELETE;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredDelete {

	@Test
	public void restAssureddel() throws JSONException {
		RestAssured.baseURI="https://reqres.in/api/users/2";
		String name="Janet";
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject reqparam=new JSONObject();
		reqparam.put("first_name","Janet");
		request.body(reqparam.toString());
		Response response=request.delete("/delete/"+ name);
		
		int statusCode = response.getStatusCode();
		 System.out.println(response.asString());
		 Assert.assertEquals(statusCode, 204);
		
	}
}
