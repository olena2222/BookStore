package restServiceTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import restServiceTests.pojo.AuthReq;
import restServiceTests.pojo.UserReq;
import restServiceTests.pojo.UserRes;
import restServiceTests.pojo.AuthRes;

public class POSTUserTest {
    @Test
    void authenticateUser(){
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

        UserReq userReq = new UserReq("irwаrgjnjnjRtgi", "GFbgh&udfgd34");
        UserRes userRes = RestAssured
                .given()
                .when()
                .header("Authorization", "Bearer " + authRes.getToken())
                .body(userReq)
                .post("/User")
                .then()
                .statusCode(201)
                .extract().response().as(UserRes.class);
    }

}
