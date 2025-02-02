package com.testingacademy.test.integration.crud;

import com.testingacademy.base.BaseTest;
import com.testingacademy.endpoints.APIConstants;
import com.testingacademy.modules.BookingResponse;
import io.qameta.allure.*;
import io.restassured.RestAssured;
import org.assertj.core.api.Assert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.awt.geom.RectangularShape;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.*;

public class testVerifyCreateBookingPOST01<SELF> extends BaseTest {


    @Owner("Pramode")
    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT")
    @TmsLink("RBT-4")
    @Issue("JIRA-RBT-4")
    @Description("Verify that POST Request is working fine")
    @Test
    public void testVerifyCreateBookingPOST01() {


        requestSpecification
                .basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response =
                RestAssured
                        .given(requestSpecification)
                        .when().body(payloadManager.createPayloadBookingAsString()).post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

// Default Rest Assured - validation

        validatableResponse.body("booking.firstname", Matchers.equalTo("Pramod"));
        BookingResponse bookingResponse = (BookingResponse) payloadManager.bookingResponsJava(response.asString());

        //AssertJ

        BookingResponse bookingRespons = new BookingResponse();
        assertThat(bookingRespons.getBookingid()).isNotNull();
        assertThat(bookingRespons.getBookingid().toString()).isNotNull().isNotNull();
        SELF equalTo;
        equalTo = (SELF) assertThat(bookingRespons.getBookingid().toString()).isEqualTo("Pramod");

        // TestNG Assertions

        assertActions.verifyStatusCode(response, 200);

    }

    private <SELF extends Assert<SELF, Object>> Assert<SELF, Object> assertThat(Object bookingid) {


        return null;
    }
}
