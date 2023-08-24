package API.RestAssuredDemo;

import static org.hamcrest.Matchers.is;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SportyShoes extends TestBase{

	@Test(priority = 0)
	public void GETshoereq() {
	
		RestAssured
			.when()
				.get("http://localhost:9010/get-shoes")
			.then()
				.statusCode(200)
				.assertThat()
				.body("shoes[0].name", is("BlueWave Running Shoes"));
	logger.info("Resource verified Successfully");
	
	}
	
	@Test(priority = 1)
	public void GETuserreq() {
	
		RestAssured
			.given()
				.contentType("application/json")
			.when()
				.get("http://localhost:9010/get-users")
			.then()
				.statusCode(200)
				.assertThat()
				.body("users[0].name", is("John Watson"));
	logger.info("Resource verified Successfully");
	
	}
	
	@Test(priority = 2)
	public void POSTreq() {
		RestAssured
			.when()
				.post("http://localhost:9010/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
			.then()
				.statusCode(200)
				.assertThat()
				.body("shoe.name", is("SampleShoe"));
	
	logger.info("Resource created");
	}
}
