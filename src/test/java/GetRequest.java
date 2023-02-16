import io.restassured.RestAssured;
import sun.plugin2.message.GetAuthenticationMessage;
import sun.security.krb5.internal.AuthorizationData;



public class GetRequest {

        //Get Me request

        public static void main(String[] args) {
        RestAssured.given().baseUri("https://api.trello.com/1/members/me").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                when().
                get().prettyPrint();
    }

     {
         //Auth Request

            RestAssured.given().baseUri("https://api.trello.com/1/members/me").
            queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
            queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
            when().
            get().prettyPrint();

    }
    {
        //Get Organization ID

        RestAssured.given().baseUri("https://api.trello.com/1/organizations/63c04bad98d6a603ee906866").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                when().
                get().prettyPrint();

    }
    {
        //Get Organisation

        RestAssured.given().baseUri("https://api.trello.com/1/organizations").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                when().
                get().prettyPrint();

    }
    {
        //Get Board in an Organization
                RestAssured.given().baseUri("https://api.trello.com/1/organizations").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                queryParam("OrganizationId","id").
                when().
                get().prettyPrint();

    }
    {
        //Get All lists in a Board
        RestAssured.given().baseUri("https://api.trello.com/1/boards/{id}/lists").
                queryParam("token","ATTAd4efe7ea7d8d89fd77a3372240aa4074ec140aebce038eddbde51d7c3e51aba940615815").
                queryParam("key","a34bb4cc2e4128ff64456402f9b8a211").
                queryParam("OrganizationId","id").
                queryParam("BoardId","id").
                when().
                get().prettyPrint();


    }
}
