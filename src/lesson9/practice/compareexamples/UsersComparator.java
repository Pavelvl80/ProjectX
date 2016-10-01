package lesson9.practice.compareexamples;

import java.util.Comparator;

/**
 * Created by Edvard Piri on 01.10.2016.
 */
public class UsersComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}
