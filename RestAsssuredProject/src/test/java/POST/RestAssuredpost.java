package POST;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredpost {

	@Test
	public void restAssuredpost() throws JSONException {
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification request=RestAssured.given();
		
		JSONObject reqparams=new JSONObject();
		reqparams.put("name", "bran");
		reqparams.put("job", "betterQAengineer");
		request.header("Content-Type", "application/json");
		request.body(reqparams.toString());
		Response resp=request.post();
		
		ResponseBody body=resp.getBody();
		
		System.out.println(body);
		System.out.println(resp.asString());
		System.out.println(resp.asPrettyString());
		
		//RegistrationSuccessResponse responseBody = body.as(RegistrationSuccessResponse.class);
		
		int statuscode=resp.getStatusCode();
		Assert.assertEquals(statuscode, 201);
		String successCode = resp.jsonPath().get("SuccessCode");
		System.out.println("success code"+successCode);
		
	}
}
