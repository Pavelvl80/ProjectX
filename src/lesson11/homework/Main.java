package lesson11.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Edvard Piri on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Replacer rep = new Replacer();
        Map<String, String > map = new HashMap<>();
        map.put("abs", "stream");
        map.put("asd", "is");
        map.put("df", "on");

        System.out.println(rep.replacer(map));
    }
}
