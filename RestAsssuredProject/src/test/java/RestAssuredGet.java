import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class RestAssuredGet {
	@Test
	public void restAssuredGet() {
		
		given().get("https://reqres.in/api/unknown")
		.then()
		.statusCode(200)
		.body("total",equalTo(12))
		.log().all()
		.body("data.id[0]",equalTo(1))
		.body("data.name",hasItems("cerulean"));
	}

}
