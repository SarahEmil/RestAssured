import io.restassured.RestAssured;

public class GetRequest_Param {

    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://api.trello.com/1/members/me")
                .queryParam("page","3" )
                .when()
                .get().prettyPrint();
    }
}
