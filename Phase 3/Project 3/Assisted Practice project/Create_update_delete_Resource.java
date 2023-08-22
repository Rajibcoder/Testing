package API.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Assert;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.is;

public class Create_update_delete_Resource extends TestBase{

	HashMap<String, String> map = new HashMap<String, String>();
	
	UUID uuid = UUID.randomUUID();
	int id;
	Response response;
	JsonPath jsonPath;
	
	@Test(priority = 0)
	public void createPayLoad() {
		map.put("name", "Rajib");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
		logger.info("Payload created");
	}
	
	@Test(priority = 1)
	public void createResourse() {
		response = RestAssured
				.given()
					.contentType("application/json")
					.body(map)
					.header("Authorization", "Bearer 7c7f3203f3ad7a97e67c24dbed87536d541eca6577e1758839895e37f23b6b41")
				.when()
					.post()
				.then()
					.extract().response();
		
		logger.info("Resourse created");
		jsonPath = response.jsonPath();
		id = jsonPath.get("id");
		System.out.println(id);
	}
	
	@Test(priority = 2)
	public void verifyResourse() {
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 7c7f3203f3ad7a97e67c24dbed87536d541eca6577e1758839895e37f23b6b41")
			.when()
				.get("https://gorest.co.in/public/v2/users/"+id)
			.then()
				.statusCode(200);
				
		logger.info("Resourse verified Successfully");
		Assert.assertTrue(jsonPath.get("name").equals("Rajib"));
	}
	
	@Test(priority = 3)
	public void updateResourse() {
		map.put("name", "Rana");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/"+id;
		
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 7c7f3203f3ad7a97e67c24dbed87536d541eca6577e1758839895e37f23b6b41")
				.body(map)
			.when()
				.put()
			.then()
				.statusCode(200)
				.assertThat()
				.body("name", is("Rana"));
		logger.info("Resourse Updated Successfully");
	}
	
	@Test(priority = 4)
	public void deleteResourse() {
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/"+id;
		
		RestAssured 
			.given()
				.header("Authorization", "Bearer 7c7f3203f3ad7a97e67c24dbed87536d541eca6577e1758839895e37f23b6b41")
			.when()
				.delete()
			.then()
				.statusCode(204);
		logger.info("Resourse Deleted Successfully");
	}
}
