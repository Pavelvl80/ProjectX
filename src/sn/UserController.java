package sn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class UserController {
    //emulates db
        UserDAO userDAO = new UserDAOImpl();

//    User checkEquals(User user) throws Exception {
//        boolean check = true;
//        for (User user1 : users) if (user.equals(user1)) check = false;
//        if (check == false) throw new Exception("EqualsUsers");
//        return user;
//    }
//
    void register(User user) {
        userDAO.save(user);
    }

    void deleteUser(User user) {
        userDAO.delete(user);
    }

    void changeActiveStatus(User user) {
        userDAO.makeInactive(user);
    }

    void update(User user) {
        userDAO.update(user);
    }

    Set<User> getUsers() {
        return userDAO.getUsers();
    }

    //TODO add to friend method/ DONE
    void addToFriend(User fromUser, User toUser) {
            fromUser.getFriends().add(toUser);
            toUser.getFriends().add(fromUser);
    }

}
