package sn;

import java.util.Set;

/**
 * Created by Edvard Piri on 08.10.2016.
 */
public interface UserDAO {
    User save(User user);

    User delete(User user);

    User makeInactive(User user);

    User update(User user);

    Set<User> getUsers();
}
