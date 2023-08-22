package API.RestAssuredDemo;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PUTdemoBearerToken {

	HashMap<String, String> map = new HashMap<String, String>();
	@BeforeMethod
	public void CreatePayLoad() {
		map.put("name", "Batman");
		map.put("email", "superman1110@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/4495004";
	}
	@Test
	public void updateResourse() {
		Response response = RestAssured
		.given()
			.contentType("application/json")
			.header("Authorization", "Bearer 7c7f3203f3ad7a97e67c24dbed87536d541eca6577e1758839895e37f23b6b41")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.extract().response();
		
		JsonPath jsonpath = response.jsonPath();
		Assert.assertTrue(jsonpath.get("name").toString().equals("Batman"));
	}
	
}
