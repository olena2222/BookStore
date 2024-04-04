package restServiceTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import restServiceTests.pojo.AuthReq;
import restServiceTests.pojo.UserReq;
import restServiceTests.pojo.UserRes;
import restServiceTests.pojo.AuthRes;

public class POSTUserTest {
    @Test
    void createUser(){
        Token token = new Token();
        String authToken = token.getAuthToken();
        UserReq userReq = new UserReq("iroRtpgi", "GFbgh&udf34");
        UserRes userRes = RestAssured
                .given()
                .when()
                .header("Authorization", "Bearer " + authToken )
                .body(userReq)
                .post("/User")
                .then()
                .statusCode(201)
                .extract().response().as(UserRes.class);
    }

}
