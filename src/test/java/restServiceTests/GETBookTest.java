package restServiceTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class GETBookTest {
    @Test
 void getBook() {
        Token token = new Token();
        String authToken = token.getAuthToken();
        RestAssured
                .given()
                .when()
                .header("Authorization", "Bearer " + authToken )
                .get("/Books")
                .then()
                .statusCode(200);
    }
}
