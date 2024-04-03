package restServiceTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import restServiceTests.pojo.AuthReq;
import restServiceTests.pojo.AuthRes;

public class GETBookTest {
    @Test
    void getBook() {
        Specs.installSpec(Specs.requestSpecification("https://bookstore.toolsqa.com", "Account/v1"), Specs.responseSpecification());
        AuthReq authReq = new AuthReq("TOOLSQA-Test", "Test@@123");
        AuthRes authRes = RestAssured
                .given()
                .when()
                .body(authReq)
                .post("/GenerateToken")
                .then()
                .statusCode(200)
                .extract().response().as(AuthRes.class);
        RestAssured
                .given()
                .when()
                .header("Authorization", "Bearer " + authRes.getToken())
                .get("/Books")
                .then()
                .statusCode(200);
    }
}
