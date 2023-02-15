import io.restassured.RestAssured;
import sun.plugin2.message.GetAuthenticationMessage;
import sun.security.krb5.internal.AuthorizationData;



public class GetRequest {

    public static void main(String[] args) {
        RestAssured.given().baseUri("https://api.trello.com/1/members/me/boards").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                when().
                get().prettyPrint();

    }
}
