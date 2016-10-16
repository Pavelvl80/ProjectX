package sn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edvard Piri on 13.10.2016.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    //make six methods with generics


    @Override
    public T save(T t) {
        return t;
    }

    @Override
    public T delete(T t) {
        return t;
    }

    @Override
    public T makeInactive(T t) {
        return t;
    }

    @Override
    public T update(T t) {
        return t;
    }

    @Override
    public List<T> getAll() {
        List list = new ArrayList();
        return list;
    }

    @Override
    public List<T> getByUserId(long id) {
        List list = new ArrayList();
        return list;
    }
}