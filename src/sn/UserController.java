package sn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class UserController {
    //emulates db
    List<User> users = new ArrayList<>();

    User checkEquals(User user) throws Exception {
        boolean check = true;
        for (User user1 : users) {
            if (user.equals(user1)) check = false;
            if (check == false) throw new Exception("EqualsUsers");
        }
        return user;
    }

    void register(User user) throws Exception {
        if (user != null) users.add(checkEquals(user));
    }

    //TODO add to friend method/ DONE
    void addToFriend(User fromUser, User toUser) {
        List<User> friends = new ArrayList<>();
        if (fromUser != null) friends.addAll(friends);
        if (toUser != null) {
            friends.add(toUser);
            fromUser.setFriends(friends);
        }
    }

    public List<User> getUsers() {
        return users;
    }

}
