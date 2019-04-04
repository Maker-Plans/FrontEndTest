package com.ractoc.makerplans.test.category;

import io.restassured.RestAssured;
import org.assertj.core.api.WithAssertions;
import org.junit.BeforeClass;

public abstract class BaseApiTest implements WithAssertions {

    protected static String port = "8181";
    protected static String path = "/";
    protected static String host = "http://localhost";

    @BeforeClass
    public static void setup() {
        String basePort = System.getProperty("server.port");
        if (basePort == null) {
            basePort = port;
        }
        RestAssured.port = Integer.valueOf(basePort);

        String basePath = System.getProperty("server.base");
        if(basePath==null){
            basePath = path;
        }
        RestAssured.basePath = basePath;

        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = host;
        }
        RestAssured.baseURI = baseHost;
    }

}
