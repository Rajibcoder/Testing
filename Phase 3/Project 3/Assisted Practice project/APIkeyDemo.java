package API.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIkeyDemo {

	@Test
	public void getWeatherInfo() {
		RestAssured
		.given()
			.param("q", "kolkata")
			.param("appid", "e4f6a7cd72f235315d2262849f978aca")
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
			.statusCode(200)
			.log().all();
	}
}
