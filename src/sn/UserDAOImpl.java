package sn;

import lesson8.homework.datastructures.Order;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Edvard Piri on 08.10.2016.
 */
public class UserDAOImpl implements UserDAO {

    Set<User> users = new HashSet<>();

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User delete(User user) {
        users.remove(user);
        return user;
    }

    @Override
    public User makeInactive(User user) {
        users.forEach(user1 -> {
            if (user1.equals(user) && user1.isActive() == true) user1.setActive(false);
            else if (user1.equals(user)) user1.setActive(true);
        });
        return user;
    }

    @Override
    public User update(User user) {
        users.forEach(user1 -> {
            if(user1.getId() == user.getId()) {
                users.remove(user1);
                users.add(user);
            }
        });
        return null;
    }

    @Override
    public Set<User> getUsers() {
        return users;
    }

}
