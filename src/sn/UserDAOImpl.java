package sn;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO {
    //emulates db
    private static List<User> users = new ArrayList<>();


    //    @Override
//    public User save(User user) {
//        users.add(user);
//        return user;
//    }

    @Override
    public void setLogin(User user) {
        int i = users.indexOf(user);

        if (user.isLogged()) user.setLogged(false);
        else user.setLogged(true);

        users.set(i, user);
    }

    @Override
    public User get(String name, String psw) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(psw))
                return user;
        }
        return null;
    }

    @Override
    public User makeInactive(User user) {
        int i = users.indexOf(user);
        user.setActive(false);
        users.set(i, user);

        return user;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}