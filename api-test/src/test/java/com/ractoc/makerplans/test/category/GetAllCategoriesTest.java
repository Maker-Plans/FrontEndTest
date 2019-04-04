package com.ractoc.makerplans.test.category;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllCategoriesTest extends BaseApiTest {

    @Test
    public void pingTest() {
        given().when().get("/category?categoryType=ARTICLE").then().log().body().statusCode(200);
    }

}
