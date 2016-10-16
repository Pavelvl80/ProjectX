package sn;

import java.util.Set;

public interface UserDAO {
    User save(User user);

    User get(String name, String psw);

    void setLogin(User user);

    Set<User> getAll();

    //User delete(User user);

    //User makeInactive(User user);

    //User update(User user);
}