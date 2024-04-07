package com.endava.atf.RestSteps;

import io.cucumber.java.en.When;

import java.util.Map;

public class UpdateBooking {

    @When("user populates GiftCard fields with data")
    public void updateBooking(Map<String, String> dataTable) {
        String recipientName = String.valueOf(dataTable.get("firstname"));
        String recipientEmail = String.valueOf(dataTable.get("lastname"));
        String senderName = String.valueOf(dataTable.get("totalprice"));
        String senderEmail = String.valueOf(dataTable.get("depositpaid"));
        String additionalneeds = String.valueOf(dataTable.get("additionalneeds"));
        String checkin = String.valueOf(dataTable.get("checkin"));
        String checkout = String.valueOf(dataTable.get("checkout"));


    }
}
