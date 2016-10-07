package sn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edvard Piri on 06.10.2016.
 */
public class UserController {
    //emulates db
    List<User> users = new ArrayList<>();

    User register(User user) throws Exception {
        if(user.equals(users))
        users.add(user);
        return user;
    }

    //TODO add to friend method
    //void addToFriend(User fromUser, User toUser)

    public List<User> getUsers() {
        return users;
    }
}
