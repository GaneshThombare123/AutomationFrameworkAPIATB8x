package com.testingacademy.asserts;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class AssertActions {

    // Common Assertions - which can be Used

    public void verifyResponseBody(String actual, String expected, String description ){
        assertEquals(actual, expected, description);

    }

    public void verifyResponseBody(int actual, int expected, String description ){
        assertEquals(actual, expected, description);

    }
    public void verifyStatusCode(Response response, Integer expected){
        assertEquals(response.getStatusCode(),expected);

    }





}
