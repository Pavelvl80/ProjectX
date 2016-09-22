package lesson6.homework.userutils;

/**
 * Created by Edvard Piri on 21.09.2016.
 */
public final class UserUtils {
    static User[] uniqueUsers(User[] users) {
        int length = 0;
        int index = 0;

        for (int i = 0; i < users.length; i++) {
            for (int j = i; j < users.length; j++) {
                if (i != j && users[i].equals(users[j])) {
                    length++;
                }
            }
        }
        User[] cloneUsers = new User[length];
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])){
                    cloneUsers[index] = users[j];
                    index++;
                }
            }
        }
        return cloneUsers;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        int length = 0;
        int index = 0;

        for (int i = 0; i < users.length; i++) {
            if (balance == users[i].getBalance()) {
                length++;
            }
        }
        User[] equalBalance = new User[length];
        for (int i = 0; i < users.length; i++) {
            if (balance == users[i].getBalance()) {
                equalBalance[index] = users[i];
                index++;
            }
        }
        return equalBalance;
    }

    static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getSalary() + user.getBalance());
        }
        return users;
    }

    static final long[] getUsersId(User[] users) {
        long[] id = new long[users.length];

        for (int i = 0; i < users.length; i++) {
            id[i] = users[i].getId();
        }
        return id;
    }

    static User[] deleteEmptyUsers(User[] users) {
        int newLength = 0;
        int i = 0;

        for (User user : users) {
            if (user != null) newLength++;
        }
        User[] newUsers = new User[newLength];
        for (User user : users) {
            if (user != null) {
                newUsers[i] = user;
                i++;
            }
        }
        return newUsers;
    }
}
