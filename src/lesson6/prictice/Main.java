package lesson6.prictice;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Edvard Piri on 18.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1001, "Jack", "Dawson", "IBM");
        User user2 = new User(1002, "Jack", "Dawson", "IBM");

        User user3 = new User(1001, "Jack", "Dawson", "IBM");

        User user4 = user1;

        System.out.println(user1 == user2);
        System.out.println(user1 == user2);

        //  System.out.println(user1 == user2);

        //  System.out.println(user1 == user2);

        //  System.out.println(user1 == user2);

        System.out.println(user1.equals(user3));

        Set<User> set = new HashSet<User>();
        set.add(user1);
        set.add(user3);

        System.out.println(set.toString());

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user4.hashCode());
    }
}
