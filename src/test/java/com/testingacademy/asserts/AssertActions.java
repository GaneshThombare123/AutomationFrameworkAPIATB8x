package com.testingacademy.asserts;

import com.beust.jcommander.StringKey;
import com.testingacademy.modules.BookingResponse;
import io.restassured.response.Response;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.Assert.assertEquals;

public class AssertActions<SELF> {

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

public void verifyStringKey(String KeyExpect, String KeyActual){
          //AssertJ

    assertThat(KeyExpect).isNotNull();
    assertThat(KeyExpect).isNotNull().isNotBlank();
    assertThat(KeyActual).isEqualTo(KeyActual);

}



}
