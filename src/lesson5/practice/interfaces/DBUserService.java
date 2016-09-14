package lesson5.practice.interfaces;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class DBUserService implements DBService {

    @Override
    public Object save(Object user) {
        System.out.println(user.toString() + " saved");
        return user;
    }

    @Override
    public Object delete(Object user) {
        System.out.println(user.toString() + " deleted");
        return user;
    }

    @Override
    public Object update(Object user) {
        System.out.println(user.toString() + " updated");
        return user;
    }
}
