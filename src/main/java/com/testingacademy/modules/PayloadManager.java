package com.testingacademy.modules;

import com.google.gson.Gson;
import com.testingacademy.pojos.Booking;
import com.testingacademy.pojos.BookingDates;

public class PayloadManager<BookingResponse> {

    // Converting the JAVA Object to String
    // GSON

    Gson gson;

    public String createPayloadBookingAsString() {


        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(122);
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");

        booking.setBookingDates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        gson = new Gson();
        String jsonStringpayload = gson.toJson(booking);
        System.out.println(jsonStringpayload);
        return jsonStringpayload;



    }


public com.testingacademy.modules.BookingResponse bookingResponsJava(String responseString){
        gson = new Gson();
    Class<? extends BookingResponse> BookingResponse = null;
    BookingResponse bookingResponse = gson.fromJson(responseString,BookingResponse);
        return (com.testingacademy.modules.BookingResponse) bookingResponse;


        //  public String createPayloadBookingFromExcel(){} - data will fetch from Excel/ CSV files

    String getResponse;
    String response1 = getResponse;
    String response = getResponse;{
Booking booking = gson.fromJson(getResponse, Booking.class);
        com.testingacademy.modules.BookingResponse Booking = null;
        return Booking;
    }


}


    public Booking getResponsFromJSON(String string) {
        return null;
    }
}









