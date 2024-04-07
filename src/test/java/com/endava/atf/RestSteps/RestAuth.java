/*
package com.endava.atf.RestSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class RestAuth {
    private final CommonLogger logger = new CommonLogger();
    public static HashMap map = new HashMap();
    @BeforeClass
    public void data()
    {
        map.put("username", "admin");
        map.put("password", "password123");
    }
    @Test
    public void userAuth()
    {
        given().contentType("application/json").body(map)
                .when()
                .post("https://restful-booker.herokuapp.com/auth")
                .then()
                .statusCode(200).statusLine("HTTP/1.1 200 OK");

    }
}
*/
