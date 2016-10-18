package sn;

import java.util.List;

public interface UserDAO  {
    User save(User user);

    User get(String name, String psw);

    void setLogin(User user);

    List<User> getAll();

    User delete(User user);

    User makeInactive(User user);

    User update(User user);
}