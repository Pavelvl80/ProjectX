package lesson9.practice.compareexamples;

import java.util.*;

/**
 * Created by Edvard Piri on 01.10.2016.
 */
public class CompareExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Yalta");
        list.add("Kiev");
        list.add("Krakow");
        list.add("Praga");


//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String str1, String str2) {
//
//                return str1.compareTo(str2);
//            }
//        };

        list.sort(new AlphabetComp());

        System.out.println(list);

        //array example
        String[] cities = {"Yalta", "Kiev", "Praga", "Krakow"};

        Arrays.sort(cities);

        System.out.println(Arrays.deepToString(cities));
        //example 2
        User[] users = new User[4];
        users[0] = new User("Roma", 15);
        users[1] = new User("Denis", 25);
        users[2] = new User("Alexey", 5);
        users[3] = new User("Rita", 55);

        Arrays.sort(users, new UsersComparator());

        System.out.println(Arrays.deepToString(users));

        Set<User> set = new TreeSet<>();
        set.add(new User("Roma", 15));
        set.add(new User("Denis", 25));
        set.add(new User("Alexey", 5));
        set.add(new User("Rita", 55));

        System.out.println(set);

    }
}
