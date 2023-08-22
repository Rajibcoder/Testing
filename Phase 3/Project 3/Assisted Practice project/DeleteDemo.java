package API.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteDemo {
	
	@Test
	public void DeleteResourse() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users/695";
		
		RestAssured 
			.when()
				.delete()
			.then()
				.statusCode(204);
	}
}
