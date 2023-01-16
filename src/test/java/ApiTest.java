import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.net.ResponseCache;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    void test1(){
        //Response response = RestAssured.get("https://api.apilayer.com/fixer/latest?base=USD&symbols=EUR,GBP");
        //RestAssured.given().header("apikey","CRZe7J86FE7s8LasExyGSe6115Cz5Yur");
        Response response = given()
                .baseUri("https://api.apilayer.com/")
                .header("apikey", "CRZe7J86FE7s8LasExyGSe6115Cz5Yur")
                .get("/fixer/latest?base=USD&symbols=EUR,GBP");
        //response.getBody();
        System.out.println( response.getStatusCode());
        System.out.println( response.asString());
        System.out.println( response.getBody().asString());
    }
}
