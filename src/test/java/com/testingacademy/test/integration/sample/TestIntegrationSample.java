package com.testingacademy.test.integration.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {
    // Create a booking, create a token
    // Get booking
    // Update the booking
    // Delete the booking

    @Test(groups = "integration", priority = 1)
    @Owner("Pramod")
    @Description("TC#INT1 - Step 1. Verify that the Booking can be Created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }
    @Test(groups = "integration", priority = 2)
    @Owner("Pramod")
    @Description("TC#INT1 - Step 1. Verify that the Booking By ID")
    public void testVerifyBookingID(){
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
