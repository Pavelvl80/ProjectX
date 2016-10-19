package sn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edvard Piri on 13.10.2016.
 */
public class AbstractDAOImpl<T extends Message> implements AbstractDAO<T> {
     List<T> db = new ArrayList<>();
    //make six methods with generics


    @Override
    public T save(T t) {
        db.add(t);
        return t;
    }

    @Override
    public T update(T t) {
        db.indexOf(t);

        return t;
    }

    @Override
    public T delete(T t) {
        db.remove(t);
        return t;
    }

    @Override
    public T findById(T t) {
        T result = null;
        for(T elem : db) {
            if (elem.getId() == t.getId()) result = t;
        }
        return result;
    }

    @Override
    public List<T> getAll() {
        return db;
    }

    @Override
    public List<T> getAllWithParameter(List<String> params) {
        List<String > result = new ArrayList<>();

        return null;
    }
}
