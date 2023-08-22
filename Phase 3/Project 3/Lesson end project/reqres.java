package API.RestAssuredDemo;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.is;


public class reqres extends TestBase{

	HashMap<String, String> map = new HashMap<String, String>();
	
	
	@Test(priority = 0)
	public void GETreq() {
	
		RestAssured
			.when()
				.get("https://reqres.in/api/users?page=2")
			.then()
				.statusCode(200)
				.assertThat()
				.body("data[0].first_name", is("Michael"));
	logger.info("Resource verified Successfully");
	
	}
	
	@Test(priority = 1)
	public void createResourse() {
		map.put( "name", "morpheus");
		map.put( "job", "leader");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users";
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
			.when()
				.post()
			.then()
				.statusCode(201)
				.assertThat()
				.body("job", is("leader"));
		
		logger.info("Resource created");
	}
	
	@Test(priority = 2)
	public void updateResourse() {
		map.put( "name", "morpheus");
		map.put( "job", "Doctor");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users/2";
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
			.when()
				.put()
			.then()
				.statusCode(200)
				.assertThat()
				.body("job", is("Doctor"));
		
		logger.info("Resource updated");
	}
	
	@Test(priority = 3)
	public void deleteResourse() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users/2";
		
		RestAssured 
			.when()
				.delete()
			.then()
				.statusCode(204);
		logger.info("Resource Deleted Successfully");
	}
}
