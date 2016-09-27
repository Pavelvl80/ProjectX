package lesson8.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Edvard Piri on 25.09.2016.
 */
public class TestMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "jan");
        map.put("2", "feb");
        map.put("3", "Mar");

        System.out.println(map.get("2"));

        System.out.println(map.keySet());

        System.out.println(map);
    }
}
