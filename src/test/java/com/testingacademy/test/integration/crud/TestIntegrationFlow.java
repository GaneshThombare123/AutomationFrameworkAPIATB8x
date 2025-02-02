package com.testingacademy.test.integration.crud;

import com.testingacademy.base.BaseTest;
import com.testingacademy.endpoints.APIConstants;
import com.testingacademy.modules.BookingResponse;
import com.testingacademy.pojos.Booking;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TestIntegrationFlow extends BaseTest {

    public class TestIntegrationSample {
        // Create a booking, create a token
        // Get booking
        // Update the booking
        // Delete the booking

        @Test(groups = "integration", priority = 1)
        @Owner("Pramod")
        @Description("TC#INT1 - Step 1. Verify that the Booking can be Created")
        public void testCreateBooking(@org.jetbrains.annotations.NotNull ITestContext iTestContext){

            requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
            response = RestAssured
                    .given(requestSpecification)
                            .when().body(payloadManager.createPayloadBookingAsString()).post();

            validatableResponse = response.then().log().all();
            validatableResponse.statusCode(200);

            BookingResponse bookingResponse = payloadManager.bookingResponsJava(response.asString());
            iTestContext.setAttribute("bookingid", bookingResponse.getBookingid());

        }
        @Test(groups = "integration", priority = 2)
        @Owner("Pramod")
        @Description("TC#INT1 - Step 1. Verify that the Booking By ID")
        public void testVerifyBookingID(@NotNull ITestContext iTestContext){

           Integer bookingid = (Integer) iTestContext.getAttribute("bookingid");

          // GET REQUEST
            String basePathGET = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingid;
            System.out.println(basePathGET);

requestSpecification.basePath(basePathGET);
response = RestAssured
        .given(requestSpecification)
                .when().get();
validatableResponse =response.then().log().all();


//Validable Assertion
validatableResponse.statusCode(200);

            Booking booking = payloadManager.getResponsFromJSON(response.asString());
            assertThat(booking.getFirstname()).isNotNull().isNotBlank();
            assertThat(booking.getFirstname()).isEqualTo("Pramod");











            Assert.assertTrue(true);
        }
        @Test(groups = "integration", priority = 3)
        @Owner("Pramod")
        @Description("TC#INT1 - Step 1. Verify Updated Booking by ID")
        public void testupdateBookingID(){
            Assert.assertTrue(true);
        }
        @Test(groups = "integration", priority = 4)
        @Owner("Pramod")
        @Description("TC#INT1 - Step 1. Delete the Booking by ID")
        public void testDeleteBookingID(){
            Assert.assertTrue(true);
        }
    }

}
