package API.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenDemo {

	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	@BeforeMethod
	public void CreatePayLoad() {
		map.put("name", "superman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
	}
	@Test
	public void createResourse() {
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer 7c7f3203f3ad7a97e67c24dbed87536d541eca6577e1758839895e37f23b6b41")
			.when()
				.post()
			.then()
				.statusCode(201)
				.log().all();
	}
}
