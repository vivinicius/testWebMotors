package br.com.webmotors.api.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static br.com.webmotors.utils.JsonUtils.getIdByName;
import static io.restassured.RestAssured.given;

public class Make {

    private static final String URL = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Make";

    public Integer getMakeIdByName(String makeName) {

        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(URL)
                .then().log().all().extract().response();

        return (Integer) getIdByName(response.as(List.class), makeName);

//        Para evitar um codigo repetitivo, tornou-se o metodo getIdByName() em JsonUtils.java
//        List<HashMap<String, Object>> json = response.as(List.class);
//
//        for (HashMap<String, Object> make : json) {
//            if (makeName.equals(make.get("Name"))){
//                return (Integer) make.get("ID");
//            }
//        }
//        return null;
    }
}
