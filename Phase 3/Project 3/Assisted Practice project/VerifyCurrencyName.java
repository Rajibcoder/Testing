package API.RestAssuredDemo;
import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class VerifyCurrencyName {

	@Test
	public void verifyCurrency() {
		Response response = RestAssured
			.when()
				.get("https://restcountries.com/v3.1/name/japan")
			.then()
				.extract().response();
		JsonPath jsonpath = response.jsonPath();
		Assert.assertTrue(jsonpath.get("[0].currencies.JPY.name").toString().equals("Japanese yen"));
	}
}
