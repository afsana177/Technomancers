package restAssureTest;

import base.CommonAPI;
import org.openqa.selenium.remote.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AllEmployeeAPI {

    public String baseUrl = "http://info.venturepulse.org:8080/service-webapp";

    @Test
    public void callAllEmployeeResources() {
        Response response = (Response) given().when().get(baseUrl+"/api/AllEmployeeResources").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void badCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = (Response) given().when().get(baseUrl+"/api/AllEmployeeResources809879");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 404);
    }

    public void serverErrorCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = (Response) given().when().get(baseUrl+"/api/AllEmployeeResources").then().statusCode(200).extract().response();
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 200);
    }
}