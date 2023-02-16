import io.restassured.RestAssured;

public class delRequest {
    public static void main(String[] args) {

    // Delete an Organization
    RestAssured.given().baseUri("https://api.trello.com/1/organizations/{id}").
    queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
    queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
    queryParam("OrganizationId","id").
    when().
    delete();
}
    {

        // Delete a Board

        RestAssured.given().baseUri("https://api.trello.com/1/boards/{id}").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                queryParam("OrganizationId","id").
                when().
                delete();
    }
}
