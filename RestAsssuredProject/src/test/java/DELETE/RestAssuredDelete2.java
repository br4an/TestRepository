package DELETE;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class RestAssuredDelete2 {
	
	@Test
	
	public void restAssuredDelete()
	{
		when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
	}

}
