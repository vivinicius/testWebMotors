package br.com.webmotors.utils;

import java.util.HashMap;
import java.util.List;

public class JsonUtils {

    public static Object getIdByName(List<HashMap<String, Object>> json, String name){

        for (HashMap<String, Object> make : json) {
            if (name.equals(make.get("Name"))){
                return make.get("ID");
            }
        }

        return null;
    }
}
