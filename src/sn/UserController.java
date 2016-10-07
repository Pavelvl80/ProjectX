package sn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class UserController {
    //emulates db
    List<User> users = new ArrayList<>();

    User checkUsers(User user1) throws Exception {
        if (!user1.equals(users.listIterator())) {
            return user1;
        } else throw new Exception("TEST");
    }

    void register(User user) throws Exception {
        users.add(checkUsers(user));
    }

    //TODO add to friend method
    void addToFriend(User fromUser, User toUser) {
        List<User> friends = new ArrayList<>();
        if (fromUser != null) friends.addAll(friends);
        friends.add(toUser);
        fromUser.setFriends(friends);
    }

    public List<User> getUsers() {
        return users;
    }

}
