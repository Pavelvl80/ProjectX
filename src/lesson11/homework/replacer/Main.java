package lesson11.homework.replacer;

import lesson11.homework.replacer.Replacer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Edvard Piri on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Replacer rep = new Replacer();
        Map<String, String > map = new HashMap<>();
        map.put("dream", "fall");
        map.put("is", "in");
        map.put("df", "on");

        System.out.println(rep.replacer(map));
    }
}
