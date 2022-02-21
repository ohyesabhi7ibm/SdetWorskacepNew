import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class ListOfMethods {

	
	@Test
	public void getMethod()
	{
		Response res=given().when().get("https://reqres.in/api/users/2");
	System.out.println(res.asString());
	}
	
	@Test
	public void getMethod2()
	{
		Response res=given().when().get("https://reqres.in/api/unknown");
	System.out.println(res.asString());
	
	assertEquals(res.getStatusCode(),200);
	}
}
