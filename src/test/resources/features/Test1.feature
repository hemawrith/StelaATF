@ToRun
Feature: Happy path

  Scenario: User is able to login
    Given I have valid credentials
    When user sends CreateBooking POST request
      | firstname       | Jim        |
      | lastname        | Brown      |
      | totalprice      | 111        |
      | depositpaid     | true       |
      | checkin         | 2018-01-01 |
      | checkout        | 2019-01-01 |
      | additionalneeds | Breakfast  |