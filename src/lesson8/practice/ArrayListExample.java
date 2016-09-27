package lesson8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by Edvard Piri on 25.09.2016.
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println(list);

        list.add("item");
        list.add("item1");
        list.add("item2");
        list.add("item3");

        System.out.println(list);

        list.add(1, "item9");

        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Test");
        list1.add("test2");

        list.addAll(list1);

        System.out.println(list);

        System.out.println(list.indexOf("Test"));

        UnaryOperator<String> op = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.contains("Item")) {
                    return null;
                }
                return s;
            }
        };
        //list.replaceAll(op);

        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list1.add("item");

        //list.retainAll(list2);

        System.out.println(list);
    }
}
