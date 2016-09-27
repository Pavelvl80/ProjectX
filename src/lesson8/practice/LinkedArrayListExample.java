package lesson8.practice;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Edvard Piri on 25.09.2016.
 */
public class LinkedArrayListExample {

    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("item");
        list.add("item1");
        list.add("item2");
        list.add("item3");

        System.out.println(list);
    }
}
