package Boards;

import io.restassured.RestAssured;

public class GetBoardsInAnOrganization {
    public static void main(String[] args) {
        RestAssured.given().
                baseUri("https://api.trello.com/1/organizations/id/boards").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                queryParam("id","63cb25340eb24b01d23f22ce").
                when().
                get().prettyPrint();

    }

    public static class DeleteBoard {
    }
}
