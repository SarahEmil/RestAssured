package Lists;

import io.restassured.RestAssured;

public class CreateListInBoard {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://api.trello.com/1/boards/{id}/lists").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                queryParam("OrganizationId","id").
                queryParam("BoardId","id").
                when().
                get().prettyPrint();
    }
}
