package br.com.webmotors.api.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;

import static br.com.webmotors.utils.JsonUtils.getIdByName;
import static io.restassured.RestAssured.given;

public class Page {

    private static final String URL = "http://desafioonline.webmotors.com.br/api/OnlineChallenge/Vehicles";

    private String price;

    public Integer getVehiclesPageIdByVersionName(String versionName, Integer pageNumber) {
        Response response = given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .param("Page", pageNumber)
                .get(URL)
                .then().log().all().extract().response();

        List<HashMap<String, Object>> json = response.as(List.class);

        for (HashMap<String, Object> page : json) {
            if (versionName.equals(page.get("Version"))) {
                price = page.get("Price").toString();
                return (Integer) page.get("ID");
            }
        }

        return null;
    }

    public String getPrice() {
        return price;
    }
}
