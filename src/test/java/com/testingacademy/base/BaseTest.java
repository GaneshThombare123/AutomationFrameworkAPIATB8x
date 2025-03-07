package com.testingacademy.base;

import com.testingacademy.asserts.AssertActions;
import com.testingacademy.endpoints.APIConstants;
import com.testingacademy.modules.PayloadManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;


    @BeforeTest
    public void setUp(){
//BASE UAR,CONTAIN TYPE JSON

        payloadManager = new PayloadManager();
        assertActions = new AssertActions();

        requestSpecification =
                RestAssured.given()
                        .baseUri(APIConstants.BASE_URL)
                        .contentType(ContentType.JSON)
                        .log().all();




    }





}
