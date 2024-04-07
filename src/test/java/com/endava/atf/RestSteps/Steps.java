package com.endava.atf.RestSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpEntity;

public class Steps {
    private RequestSpecification request;

    @Given("I have valid credentials")
    public void i_have_valid_credentials() {
        // Set up the base URI for the REST API
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/auth";

        // Initialize the request specification
        request = RestAssured.given()
                .auth()
                .basic("admin", "password123"); // Replace "username" and "password" with actual credentials
    }
}
