package lesson6.homework.userutils;

import java.util.Arrays;

/**
 * Created by Edvard Piri on 22.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user0 = new User(1, "leroy", "Jenkins", 1000, 3000);
        User user1 = new User(2, "Jack", "Thompson", 2000, 2000);
        User user2 = new User(3, "leroy", "Jenkins", 3000, 4000);
        User user3 = new User(4, "Tom", "Smith", 4000, 6000);
        User user4 = new User(5, "Jack", "Thompson", 5000, 3000);
        User user5 = null;

        User[] users = {user0, user1, user2, user3, user4, user5};


//        System.out.println(Arrays.deepToString(UserUtils.uniqueUsers(users)));
//        System.out.println(Arrays.deepToString(UserUtils.usersWithContitionalBalance(users, 3000)));
        for (int i = 0; i < users.length; i++) {
//            System.out.println(UserUtils.paySalaryToUsers(users)[i]);
//            System.out.println(UserUtils.getUsersId(users)[i]);
            System.out.println(UserUtils.deleteEmptyUsers(users)[i]);
            System.out.println(users[i]);
        }
    }
}
