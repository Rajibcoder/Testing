package API.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETdemoBearerToken {

	@Test
	public void verfyResourse() {
		RestAssured
		.given()
			.contentType("application/json")
			.header("Authorization", "Bearer 7c7f3203f3ad7a97e67c24dbed87536d541eca6577e1758839895e37f23b6b41")
		.when()
			.get("https://gorest.co.in/public/v2/users/4495004")
		.then()
			.statusCode(200)
			.log().all();
	}
}
