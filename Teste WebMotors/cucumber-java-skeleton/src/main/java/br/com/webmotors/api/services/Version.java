package br.com.webmotors.api.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

import static br.com.webmotors.utils.JsonUtils.getIdByName;
import static io.restassured.RestAssured.given;

public class Version {

    private static final String URL = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Version";

    public Integer getVersionIdByName(String versionName, Integer modelId) {
        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .param("ModelId", modelId)
                .get(URL)
                .then().log().all().extract().response();

        return (Integer) getIdByName(response.as(List.class), versionName);
    }
}
