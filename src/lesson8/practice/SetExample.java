package lesson8.practice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Edvard Piri on 25.09.2016.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("item");
        set.add("item1");
        set.add("item2");
        set.add("item2");

        System.out.println(set);

//        Set<String> treeSet = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String s1 = (String) 01;
//                String s2 = (String) 02;
//                return s1.length() - s2.length();
//            }
//        });
//        treeSet.add("item");
//        treeSet.add("item1");
//        treeSet.add("aitem2");
//        treeSet.add("item2");
//
//
//        Sys.out.println(treeSet);
    }
}
