import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RetrieveDetails {

	@Test
	public void getMethod()
	{
		Response res=given().when().get("https://reqres.in/api/users/2");
	System.out.println(res.asString());
	}
}
