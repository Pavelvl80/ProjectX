package lesson8.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Edvard Piri on 26.09.2016.
 */
public class ListTest {
    public static void main(String[] args) {
        int n = 1000000;
        int s = n - 1;

        List<Integer> arrayListInteger = new ArrayList<>();
        List<Integer> linkedListInteger = new LinkedList<>();
        List<String> arrayListString = new ArrayList<>();
        List<String> linkedListString = new LinkedList<>();

        for (int i = 0; i < n; i++) arrayListInteger.add(i);
        linkedListInteger.addAll(arrayListInteger);
        for (int i = 0; i < n; i++) arrayListString.add(Integer.toString(i));
        linkedListString.addAll(arrayListString);

        //ADD-TEST

        arrayListInteger.add(0, 100);
        time("arrayListInteger add");
        arrayListInteger.add(s, 100);
        time("arrayListInteger add");
        arrayListInteger.add(s / 2, 100);
        time("arrayListInteger add");

        linkedListInteger.add(0, 100);
        time("linkedListInteger add");
        linkedListInteger.add(s, 100);
        time("linkedListInteger add");
        linkedListInteger.add(s / 2, 100);
        time("linkedListInteger add");

        System.out.println();

        arrayListString.add(0, "100");
        time("arrayListString add");
        arrayListString.add(s, "100");
        time("arrayListString add");
        arrayListString.add(s / 2, "100");
        time("arrayListString add");

        linkedListString.add(0, "100");
        time("linkedListString add");
        linkedListString.add(s, "100");
        time("linkedListString add");
        linkedListString.add(s / 2, "100");
        time("linkedListString add");

        System.out.println();


        //SET TEST, LinkedList faster
        arrayListInteger.set(0, 100);
        time("arrayListInteger set");
        arrayListInteger.set(s, 100);
        time("arrayListInteger set");
        arrayListInteger.set(s / 2, 100);
        time("arrayListInteger set");

        linkedListInteger.set(0, 100);
        time("linkedListInteger set");
        linkedListInteger.set(s, 100);
        time("linkedListInteger set");
        arrayListInteger.set(s / 2, 100);
        time("linkedListInteger set");

        System.out.println();

        arrayListString.set(0, "100");
        time("arrayListString set");
        arrayListString.set(s, "100");
        time("arrayListString set");
        arrayListString.set(s / 2, "100");
        time("arrayListString set");

        linkedListString.set(0, "100");
        time("linkedListString set");
        linkedListString.set(s, "100");
        time("linkedListString set");
        linkedListString.set(s / 2, "100");
        time("linkedListString set");

        System.out.println();

        //GET TEST, ArrayList faster
        arrayListInteger.get(0);
        time("arrayListInteger get");
        arrayListInteger.get(s);
        time("arrayListInteger get");
        arrayListInteger.get(s / 2);
        time("arrayListInteger get");

        linkedListInteger.get(0);
        time("linkedListInteger get");
        linkedListInteger.get(s);
        time("linkedListInteger get");
        arrayListInteger.get(s / 2);
        time("linkedListInteger get");

        System.out.println();

        arrayListString.get(0);
        time("arrayListString get");
        arrayListString.get(s);
        time("arrayListString get");
        arrayListString.get(s / 2);
        time("arrayListString get");

        linkedListString.get(0);
        time("linkedListString get");
        linkedListString.get(s);
        time("linkedListString get");
        linkedListString.get(s / 2);
        time("linkedListString get");

        System.out.println();

        //REMOVE TEST
        arrayListInteger.remove(0);
        time("arrayListInteger remove");
        arrayListInteger.remove(s - 1);
        time("arrayListInteger remove");
        arrayListInteger.remove(s / 2);
        time("arrayListInteger remove");

        linkedListInteger.remove(0);
        time("linkedListInteger remove");
        linkedListInteger.remove(s - 1);
        time("linkedListInteger remove");
        arrayListInteger.remove(s / 2);
        time("linkedListInteger remove");

        System.out.println();

        arrayListString.remove(0);
        time("arrayListString remove");
        arrayListString.remove(s - 1);
        time("arrayListString remove");
        arrayListString.remove(s / 2);
        time("arrayListString remove");

        linkedListString.remove(0);
        time("linkedListString remove");
        linkedListString.remove(s - 1);
        time("linkedListString remove");
        linkedListString.remove(s / 2);
        time("linkedListString remove");


    }

    static void time(String str) {
        System.out.println(System.currentTimeMillis() + " " + str);
    }
}
