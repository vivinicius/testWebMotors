package br.com.webmotors.api.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;

import static br.com.webmotors.utils.JsonUtils.getIdByName;
import static io.restassured.RestAssured.given;

public class Model {
    private static final String URL = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model";

    public Integer getModelIdByName(String modelName, Integer makeId) {
        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .param("MakeID", makeId)
                .get(URL)
                .then().log().all().extract().response();

        return (Integer) getIdByName(response.as(List.class), modelName);

    }
}
