package restServiceTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import restServiceTests.pojo.AuthReq;
import restServiceTests.pojo.AuthRes;


    public class Token {
        public static String getAuthToken() {
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

            return authRes.getToken();
        }
}
