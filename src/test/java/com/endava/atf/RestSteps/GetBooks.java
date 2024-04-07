package com.endava.atf.RestSteps;



import static io.restassured.RestAssured.given;

public class GetBooks {

    public void getBooks()
    {
        given()
                .when()
                .get("https://restful-booker.herokuapp.com/booking")
                .then()
                .statusCode(200);

    }
}
