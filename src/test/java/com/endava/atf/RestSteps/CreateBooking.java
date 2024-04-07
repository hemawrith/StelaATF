package com.endava.atf.RestSteps;

//import com.endava.atf.Logger.CommonLogger;
import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class CreateBooking {
    private static final Logger logger = LoggerFactory.getLogger(CreateBooking.class);

    @When("user sends CreateBooking POST request")
    public void createBooking(Map<String, String> dataTable) {
        /*dataTable.put("username", "admin");
        dataTable.put("firstname", "password123");
        dataTable.put("lastname", "password123");
        dataTable.put("totalprice", "password123");
        dataTable.put("totalprice",String.valueOf(dataTable.get("senderName")));
        dataTable.put("additionalneeds", "password123");
        dataTable.put("checkin", "password123");
        dataTable.put("checkout", "password123");*/



        Map<String, String> bookingDates = new HashMap<>();
        bookingDates.put("checkin", "2018-01-01");
        bookingDates.put("checkout", "2019-01-01");


        Map<String, Object> requestFields = new HashMap<>();
        requestFields.put("firstname",String.valueOf(dataTable.get("firstname")));
        requestFields.put("lastname",String.valueOf(dataTable.get("lastname")));
        requestFields.put("totalprice",String.valueOf(dataTable.get("totalprice")));
        requestFields.put("depositpaid",String.valueOf(dataTable.get("depositpaid")));
        requestFields.put("bookingdates", bookingDates);
        requestFields.put("additionalneeds",String.valueOf(dataTable.get("additionalneeds")));


        given().contentType("application/json").body(requestFields)
                .when()
                .post("https://restful-booker.herokuapp.com/booking")
                .then()
                .statusCode(200).statusLine("HTTP/1.1 200 OK");
        logger.info(()->"Booking created successfully");
    }
}
